package com.gestorpro.api.gestorpro_api.entities.enums;

public enum Benefit {
    FOOD_ALLOWANCE("Food Allowance"),
    TRANSPORTATION_ALLOWANCE("Transportation Allowance"),
    MEAL_ALLOWANCE("Meal Allowance");

    private final String description;

    Benefit(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
