package br.com.criacional.builder;

import br.com.criacional.builder.builders.CarBuilder;
import br.com.criacional.builder.builders.TruckerBuilder;
import br.com.criacional.builder.cars.Car;
import br.com.criacional.builder.cars.Truck;
import br.com.criacional.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        //Criando um carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType()+" produzindo com sucesso!");

        TruckerBuilder truckerBuilder = new TruckerBuilder();
        director.constructTruck(truckerBuilder);

        Truck truck = truckerBuilder.getresult();
        System.out.println("Camihão: "+truck.result());
    }
}
