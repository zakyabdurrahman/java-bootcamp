package com.martabak;

public class Electronic {
    protected int watt;
    public Electronic() {
        this.watt = 25;
    }

    public Electronic(int watt) {
        this.watt = watt;

    }

    public int getWatt() {
        return this.watt;
    }
}
