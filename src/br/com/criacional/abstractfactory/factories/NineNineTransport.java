package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aircraft.Helicopter;
import br.com.criacional.abstractfactory.aircraft.IAircraft;
import br.com.criacional.abstractfactory.landvehicles.ILandVehicle;
import br.com.criacional.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
