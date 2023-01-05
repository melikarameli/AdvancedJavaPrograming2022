package org.example.one;

public enum Gender {
    MALE("Muški rod"), FEMALE("Žneski rod");
    private String name;

    Gender(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
