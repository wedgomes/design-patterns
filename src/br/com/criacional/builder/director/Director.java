package br.com.criacional.builder.director;

import br.com.criacional.builder.builders.IBuilder;
import br.com.criacional.builder.components.CarType;
import br.com.criacional.builder.components.Engine;
import br.com.criacional.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
        builder.setCor("Amarelo");
    }
}
