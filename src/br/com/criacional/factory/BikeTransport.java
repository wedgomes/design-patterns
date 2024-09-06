package br.com.criacional.factory;

import br.com.criacional.factory.vehicle.Bike;
import br.com.criacional.factory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
