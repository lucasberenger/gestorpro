package com.gestorpro.api.repository;

import com.gestorpro.api.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
    Optional<Company> findByCNPJ(String cnpj);
    boolean existsByCnpj(String cnpj);
}
