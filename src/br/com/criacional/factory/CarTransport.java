package br.com.criacional.factory;

import br.com.criacional.factory.vehicle.Car;
import br.com.criacional.factory.vehicle.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
