package org.example;

public class Manufacturer {
    private String country;

    public Manufacturer(String origin) {
        this.country = origin;
    }

    public void country() {
        System.out.println("Made In " + this.country);
    }
}
