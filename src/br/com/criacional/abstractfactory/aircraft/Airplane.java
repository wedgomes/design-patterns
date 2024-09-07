package br.com.criacional.abstractfactory.aircraft;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, Voo autorizado");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 24km, ventos ok!");
    }
}
