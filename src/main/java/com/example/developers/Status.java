package com.example.developers;

public enum Status {

    FORSALE("Wolne"),
    BOOKED("Zarezerwowane"),
    SOLD("Sprzedane");

    private String polishName;

    Status(String polishName) {
        this.polishName = polishName;
    }

    public String getPolishName() {
        return polishName;
    }
}
