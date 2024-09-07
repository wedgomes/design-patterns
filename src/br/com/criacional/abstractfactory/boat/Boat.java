package br.com.criacional.abstractfactory.boat;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        getCargo();
        getWave();
        System.out.println("Navio cruzando o oceano atlântico");
    }

    @Override
    public void getCargo() {
        System.out.println("Navios cargueiros prontos");
    }

    @Override
    public void getWave() {
        System.out.println("Ondas ok!");
    }
}
