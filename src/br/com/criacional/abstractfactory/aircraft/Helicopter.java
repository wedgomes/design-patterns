package br.com.criacional.abstractfactory.aircraft;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, Ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, Suldeste, Ventos ok!");
    }
}
