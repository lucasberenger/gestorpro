package com.gestorpro.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
public class UserDto {

    @Data
    public static class CreateUserDto {
        @NotBlank(message = "Name is mandatory")
        @Size(min = 5, max = 100, message = "Name must be between 5 and 100 character")
        private String name;

        @NotBlank(message = "Username is mandatory")
        @Size(min = 5, max = 100, message = "Username must have 5 characters at least")
        private String username;

        @Email(message = "Email must be valid")
        @NotBlank(message = "Email is mandatory")
        private String email;

        @NotBlank(message = "You must create a password")
        @Size(min = 8, message = "Password must have 8 characters at least")
        private String password;

        private CompanyDto.CreateCompanyDto company;

        public CreateUserDto() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public CompanyDto.CreateCompanyDto getCompany() {
            return company;
        }

        public void setCompany(CompanyDto.CreateCompanyDto company) {
            this.company = company;
        }
    }

    @Data
    public static class ResponseUserDto {
        private String id;
        private String name;
        private String username;
        private String email;
        private CompanyDto.ResponseCompanyDto company;
        private boolean active;

        public ResponseUserDto() {
        }

        public ResponseUserDto(String id, String name, String username, String email, CompanyDto.ResponseCompanyDto company, boolean active) {
            this.id = id;
            this.name = name;
            this.username = username;
            this.email = email;
            this.company = company;
            this.active = active;
        }

        public String getUserName() {
            return username;
        }

        public void setUserName(String username) {
            this.username = username;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public CompanyDto.ResponseCompanyDto getCompany() {
            return company;
        }

        public void setCompany(CompanyDto.ResponseCompanyDto company) {
            this.company = company;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }

    @Data
    public static class UpdateUserDto {
        @Size(min = 5, max =100, message = "Name must be between 5 and 100 character")
        private String name;

        @Size(min = 5, max =100, message = "Username must be between 5 and 100 character")
        private String username;

        @Size(min = 8, message = "Password must have 8 characters at least")
        private String password;

        public UpdateUserDto() {
        }

        public UpdateUserDto(String name, String username, String password) {
            this.name = name;
            this.username = username;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
