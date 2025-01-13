package com.gestorpro.api.service;

import com.gestorpro.api.dto.CompanyDto;
import com.gestorpro.api.dto.UserDto;
import com.gestorpro.api.model.Company;
import com.gestorpro.api.model.User;
import com.gestorpro.api.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final CompanyService companyService;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, CompanyService companyService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.companyService = companyService;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public UserDto.ResponseUserDto create(UserDto.CreateUserDto dto) {
        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email already in use");
        }

        if (userRepository.findByUsername(dto.getUsername()).isPresent()) {
             throw new IllegalArgumentException("Username already exists");
        }

        Company company = companyService.createCompany(dto.getCompany());

        User user =  new User();
        user.setName(dto.getName());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setCompany(company);

        user = userRepository.save(user);
        company.setManager(user);

        return convertToResponseDto(user);
    }

    public UserDto.ResponseUserDto findById(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        return convertToResponseDto(user);
    }

    public UserDto.ResponseUserDto findByUserName(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new EntityNotFoundException("Username already exists"));
        return convertToResponseDto(user);
    }

    @Transactional
    public UserDto.ResponseUserDto update(UUID id, UserDto.UpdateUserDto dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));

        if (dto.getName() != null) {
            user.setName(dto.getName());
        }

        if (dto.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        user = userRepository.save(user);
        return convertToResponseDto(user);
    }

    @Transactional
    public void delete(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        user.setActive(false);
        userRepository.save(user);
    }

    private UserDto.ResponseUserDto convertToResponseDto(User user) {
        UserDto.ResponseUserDto dto = new UserDto.ResponseUserDto();
        dto.setId(user.getId().toString());
        dto.setName(user.getName());
        dto.setUserName(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setActive(user.isActive());

        CompanyDto.ResponseCompanyDto companyDto = new CompanyDto.ResponseCompanyDto();
        companyDto.setId(user.getCompany().getId().toString());
        companyDto.setName(user.getCompany().getName());
        companyDto.setCnpj(user.getCompany().getCnpj());
        companyDto.setActive(user.getCompany().isActive());

        dto.setCompany(companyDto);
        return dto;
    }
}
