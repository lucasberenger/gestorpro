package com.gestorpro.api.gestorpro_api.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> listUser() {
        return ResponseEntity.ok("Hello");
    }
}
