package br.com.criacional.factory.vehicle;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o Delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida");
    }
}
