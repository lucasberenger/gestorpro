package com.gestorpro.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CompanyDto {

    @Data
    public static class CreateCompanyDto {
        @NotBlank(message = "Name is mandatory")
        private String name;

        @NotBlank(message = "CNPJ is mandatory")
        private String cnpj;

        public CreateCompanyDto() {
        }

        public CreateCompanyDto(String name, String cnpj) {
            this.name = name;
            this.cnpj = cnpj;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    }

    @Data
    public static class ResponseCompanyDto {
        private String id;
        private String name;
        private String cnpj;
        private boolean active;

        public ResponseCompanyDto() {
        }

        public ResponseCompanyDto(String id, String name, String cnpj, boolean active) {
            this.id = id;
            this.name = name;
            this.cnpj = cnpj;
            this.active = active;
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

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }

    @Data
    public static class UpdateCompanyDto {
        private String name;

        public UpdateCompanyDto() {
        }

        public UpdateCompanyDto(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
