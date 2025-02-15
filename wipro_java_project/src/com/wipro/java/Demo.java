package com.wipro.java;

import com.wipro.java.builders.CarBuilder;
import com.wipro.java.builders.CarManualBuilder;
import com.wipro.java.cars.Car;
import com.wipro.java.cars.Manual;
import com.wipro.java.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built: " + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual);
    }
}
