package br.com.criacional.abstractfactory;

import br.com.criacional.abstractfactory.app.Aplication;
import br.com.criacional.abstractfactory.factories.BoatTransport;
import br.com.criacional.abstractfactory.factories.ITransportFactory;
import br.com.criacional.abstractfactory.factories.NineNineTransport;
import br.com.criacional.abstractfactory.factories.UberTransport;

public class Main {

    public static Aplication configureAplication(){
        Aplication app;
        ITransportFactory factory;

        String company = "uber";

        if(company == "uber"){
//            factory = new UberTransport();
            factory = new UberTransport();
        }else if(company == "99") {
            factory = new NineNineTransport();
        }else{
            factory = new BoatTransport();
        }
        app = new Aplication(factory);

        return app;
    }
    public static void main(String[] args) {
        Aplication app = configureAplication();
        app.startRoute();
    }
}
