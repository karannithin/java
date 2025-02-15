package com.wipro.java.cars;

public class Manual {
    private final CarType type;
    private final int seats;

    public Manual(CarType type, int seats) {
        this.type = type;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car Manual for " + type + " with " + seats + " seats.";
    }
}
