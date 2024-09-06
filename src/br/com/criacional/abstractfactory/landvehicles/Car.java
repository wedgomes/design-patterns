package br.com.criacional.abstractfactory.landvehicles;

public class Car implements  ILandVehicle{
    @Override
    public void startRoutes() {
        getCargo();
        System.out.println("Iniciando o Trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, estamos prontos");
    }
}
