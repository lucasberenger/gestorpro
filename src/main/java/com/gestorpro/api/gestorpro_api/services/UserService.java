package com.gestorpro.api.gestorpro_api.services;


import com.gestorpro.api.gestorpro_api.entities.User;
import com.gestorpro.api.gestorpro_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
