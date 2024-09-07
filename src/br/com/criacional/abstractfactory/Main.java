package br.com.criacional.abstractfactory;

import br.com.criacional.abstractfactory.app.Aplication;
import br.com.criacional.abstractfactory.factories.ITransportFactory;
import br.com.criacional.abstractfactory.factories.NineNineTransport;
import br.com.criacional.abstractfactory.factories.UberTransport;

public class Main {

    public static Aplication configureAplication(){
        Aplication app;
        ITransportFactory factory;

        String company = "uber";

        if(company == "99"){
            factory = new UberTransport();
        }else {
            factory = new NineNineTransport();
        }
        app = new Aplication(factory);

        return app;
    }
    public static void main(String[] args) {
        Aplication app = configureAplication();
        app.startRoute();
    }
}
