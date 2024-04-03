package com.henriquecostadev.costumersapi.enums;

public enum Gender {
    Male("Homem"),
    Female("Mulher"),

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
