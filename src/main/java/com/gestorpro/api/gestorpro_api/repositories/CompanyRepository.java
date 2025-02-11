package com.gestorpro.api.gestorpro_api.repositories;

import com.gestorpro.api.gestorpro_api.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
