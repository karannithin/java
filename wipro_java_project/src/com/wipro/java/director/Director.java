package com.wipro.java.director;

import com.wipro.java.builders.Builder;
import com.wipro.java.cars.CarType;
import com.wipro.java.components.Engine;
import com.wipro.java.components.GPSNavigator;
import com.wipro.java.components.Transmission;
import com.wipro.java.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
