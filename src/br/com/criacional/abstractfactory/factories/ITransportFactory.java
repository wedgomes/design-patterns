package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aircraft.IAircraft;
import br.com.criacional.abstractfactory.boat.IBoat;
import br.com.criacional.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
