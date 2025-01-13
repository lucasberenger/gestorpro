package com.gestorpro.api.service;

import com.gestorpro.api.dto.CompanyDto;
import com.gestorpro.api.model.Company;
import com.gestorpro.api.repository.CompanyRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
//@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Transactional
    public Company createCompany(CompanyDto.CreateCompanyDto dto) {
        if (companyRepository.existsByCnpj(dto.getCnpj())) {
            throw new IllegalArgumentException("CNPJ already in use");
        }

        Company company = new Company();
        company.setCnpj(dto.getCnpj());
        company.setName(dto.getName());

        return companyRepository.save(company);
    }

    public CompanyDto.ResponseCompanyDto findById(UUID id) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company not found"));
        return convertToResponseDTO(company);
    }

    @Transactional
    public void delete(UUID id) {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company not found"));
        company.setActive(false);
        companyRepository.save(company);
    }

    private CompanyDto.ResponseCompanyDto convertToResponseDTO(Company company) {
        CompanyDto.ResponseCompanyDto dto = new CompanyDto.ResponseCompanyDto();
        dto.setId(company.getId().toString());
        dto.setName(dto.getName());
        dto.setCnpj(dto.getCnpj());
        dto.setActive(dto.isActive());
        return dto;
    }
}
