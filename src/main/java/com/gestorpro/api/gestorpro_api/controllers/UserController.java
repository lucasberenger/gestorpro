package com.gestorpro.api.gestorpro_api.controllers;


import com.gestorpro.api.gestorpro_api.entities.User;
import com.gestorpro.api.gestorpro_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        List<User> userList = service.getUsers();
        return ResponseEntity.ok(userList);
    }
}
