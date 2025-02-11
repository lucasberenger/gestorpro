package com.gestorpro.api.gestorpro_api.entities;

import com.gestorpro.api.gestorpro_api.entities.enums.Benefit;
import jakarta.persistence.*;

import java.io.Serializable;

public class EmployeeBenefit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Enumerated(EnumType.STRING)
    private Benefit benefit;

    private Double value;

    public EmployeeBenefit() {
    }

    public EmployeeBenefit(Long id, Employee employee, Benefit benefit, Double value) {
        this.id = id;
        this.employee = employee;
        this.benefit = benefit;
        this.value = value;
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
