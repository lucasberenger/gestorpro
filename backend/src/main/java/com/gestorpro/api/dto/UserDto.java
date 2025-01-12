package com.gestorpro.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

public class UserDto {

    @Data
    public static class CreateUserDto {
        @NotBlank(message = "Name is mandatory")
        @Size(min = 5, max = 100, message = "Name must be between 5 and 100 character")
        private String name;

        @Email(message = "Email must be valid")
        @NotBlank(message = "Email is mandatory")
        private String email;

        @NotBlank(message = "You must create a password")
        @Size(min = 8, message = "Password must have 8 characters at least")
        private String password;

        private CompanyDto.CreateCompanyDto company;

    }

    public static class ResponseUserDto {
        private String id;
        private String name;
        private String email;
        private CompanyDto.ResponseCompanyDto company;
        private boolean active;
    }

    @Data
    public static class UpdateUserDto {
        @Size(min = 5, max =100, message = "Nam must be between 5 and 100 character")
        private String name;

        @Size(min = 8, message = "Password must have 8 characters at least")
        private String password;
    }
}
