package com.wipro.java.cars;

import com.wipro.java.components.Engine;
import com.wipro.java.components.GPSNavigator;
import com.wipro.java.components.Transmission;
import com.wipro.java.components.TripComputer;

public class Car {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getType() {
        return type;
    }
}
