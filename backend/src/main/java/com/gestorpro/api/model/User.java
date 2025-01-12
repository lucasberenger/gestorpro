package com.gestorpro.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 character")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "You must have an username")
    @Size(min = 3, max = 100, message = "Username must be between 3 and 100 character")
    @Column(unique = true, nullable = false)
    private String username;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email is mandatory")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "You must create a password")
    @Size(min = 8, message = "Password must have 8 characters at least")
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean active = true;

    @OneToOne
    @JoinColumn(name = "company_id", unique = true, nullable = false)
    private Company company;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
