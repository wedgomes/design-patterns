package br.com.criacional.builder.cars;

import br.com.criacional.builder.components.CarType;
import br.com.criacional.builder.components.Engine;
import br.com.criacional.builder.components.Transmission;

public class SportCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final String cor;

    public SportCar(CarType carType, int seats, Engine engine, Transmission transmission, String cor){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.cor = cor;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getCor() {
        return cor;
    }
}
