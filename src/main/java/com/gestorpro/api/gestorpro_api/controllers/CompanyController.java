package com.gestorpro.api.gestorpro_api.controllers;


import com.gestorpro.api.gestorpro_api.entities.Company;
import com.gestorpro.api.gestorpro_api.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @GetMapping
    public ResponseEntity<List<Company>> getCompanies() {
        List<Company> companyList = service.getCompanies();
        return ResponseEntity.ok(companyList);
    }
}
