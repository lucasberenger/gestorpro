package com.gestorpro.api.gestorpro_api.repositories;

import com.gestorpro.api.gestorpro_api.entities.EmployeeBenefit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeBenefitsRepository extends JpaRepository<EmployeeBenefit, Long> {
}
