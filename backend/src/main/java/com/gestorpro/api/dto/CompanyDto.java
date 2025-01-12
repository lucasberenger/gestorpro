package com.gestorpro.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class CompanyDto {

    @Data
    public static class CreateCompanyDto {
        @NotBlank(message = "Name is mandatory")
        private String name;

        @NotBlank(message = "CNPJ is mandatory")
        private String cnpj;
    }

    @Data
    public static class ResponseCompanyDto {
        private String id;
        private String name;
        private String cnpj;
        private boolean active;
    }

    @Data
    public static class UpdateCompanyDto {
        private String name;
    }
}
