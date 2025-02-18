package com.gestorpro.api.gestorpro_api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestorpro.api.gestorpro_api.entities.enums.Benefit;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_employee_benefit")
public class EmployeeBenefit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;

    @Enumerated(EnumType.STRING)
    private Benefit benefit;

    private Double benefitValue;

    public EmployeeBenefit() {
    }

    public EmployeeBenefit(Long id, Employee employee, Benefit benefit, Double value) {
        this.id = id;
        this.employee = employee;
        this.benefit = benefit;
        this.benefitValue = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public Double getBenefitValue() {
        return benefitValue;
    }

    public void setBenefitValue(Double benefitValue) {
        this.benefitValue = benefitValue;
    }
}
