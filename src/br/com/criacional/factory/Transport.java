package br.com.criacional.factory;

import br.com.criacional.factory.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
