package br.com.criacional.abstractfactory.app;

import br.com.criacional.abstractfactory.aircraft.IAircraft;
import br.com.criacional.abstractfactory.boat.IBoat;
import br.com.criacional.abstractfactory.factories.ITransportFactory;
import br.com.criacional.abstractfactory.landvehicles.ILandVehicle;

public class Aplication {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Aplication(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoutes();
        aircraft.startRoute();
        boat.startRoute();
    }
}
