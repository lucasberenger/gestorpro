package com.gestorpro.api.gestorpro_api.controllers;


import com.gestorpro.api.gestorpro_api.entities.Employee;
import com.gestorpro.api.gestorpro_api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping()
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employeeList = service.getEmployees();
        return ResponseEntity.ok(employeeList);
    }
}

