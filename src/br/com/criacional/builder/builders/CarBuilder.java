package br.com.criacional.builder.builders;

import br.com.criacional.builder.cars.Car;
import br.com.criacional.builder.components.CarType;
import br.com.criacional.builder.components.Engine;
import br.com.criacional.builder.components.Transmission;

public class CarBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getresult(){
        return new Car(carType, seats, engine, transmission);
    }
}
