package com.gestorpro.api.gestorpro_api.services;

import com.gestorpro.api.gestorpro_api.entities.Company;
import com.gestorpro.api.gestorpro_api.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getCompanies() {
         return companyRepository.findAll();
    }
}
