package com.gestorpro.api.gestorpro_api.repositories;

import com.gestorpro.api.gestorpro_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
