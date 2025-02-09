package com.gestorpro.api.gestorpro_api.repositories;

import com.gestorpro.api.gestorpro_api.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
