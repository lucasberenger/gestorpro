package com.gestorpro.api.gestorpro_api.config;


import com.gestorpro.api.gestorpro_api.entities.Company;
import com.gestorpro.api.gestorpro_api.entities.Employee;
import com.gestorpro.api.gestorpro_api.entities.EmployeeBenefit;
import com.gestorpro.api.gestorpro_api.entities.User;
import com.gestorpro.api.gestorpro_api.entities.enums.Benefit;
import com.gestorpro.api.gestorpro_api.repositories.CompanyRepository;
import com.gestorpro.api.gestorpro_api.repositories.EmployeeBenefitsRepository;
import com.gestorpro.api.gestorpro_api.repositories.EmployeeRepository;
import com.gestorpro.api.gestorpro_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.HashSet;
import java.util.Set;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeBenefitsRepository employeeBenefitsRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUNNING ON DEV PROFILE");

        User user1 = new User(null, "Maria Brown", "MariaBrown@io.com", "988888888", "123456", null);
        userRepository.save(user1);

        Company comp1 = new Company(null, "Company1", "123456789", user1, new HashSet<>());
        companyRepository.save(comp1);
        user1.setCompany(comp1);
        userRepository.save(user1);

        Employee emp1 = new Employee(null, "Alex Green", "123456789", "999999999", "Analyst", 3000.0, comp1, new HashSet<>());
        employeeRepository.save(emp1);
        comp1.getEmployees().add(emp1);
        companyRepository.save(comp1);

        EmployeeBenefit employeeBenefit1 = new EmployeeBenefit(null, emp1, Benefit.FOOD_ALLOWANCE, 300.0);
        EmployeeBenefit employeeBenefit2 = new EmployeeBenefit(null, emp1, Benefit.TRANSPORTATION_ALLOWANCE, 150.0);
        emp1.getEmployeeBenefits().addAll(Set.of(employeeBenefit1, employeeBenefit2));
        employeeRepository.save(emp1);





    }


}
