package com.gestorpro.api.gestorpro_api.services;

import com.gestorpro.api.gestorpro_api.entities.Employee;
import com.gestorpro.api.gestorpro_api.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
