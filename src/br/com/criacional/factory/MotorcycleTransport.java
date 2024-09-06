package br.com.criacional.factory;

import br.com.criacional.factory.vehicle.IVehicle;
import br.com.criacional.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
