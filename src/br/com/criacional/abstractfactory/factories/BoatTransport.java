package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aircraft.Airplane;
import br.com.criacional.abstractfactory.aircraft.IAircraft;
import br.com.criacional.abstractfactory.boat.Boat;
import br.com.criacional.abstractfactory.boat.IBoat;
import br.com.criacional.abstractfactory.landvehicles.Car;
import br.com.criacional.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
