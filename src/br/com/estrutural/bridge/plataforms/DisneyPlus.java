package br.com.estrutural.bridge.plataforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println("Tramissão da DisneyPlus Iniciada");
    }

    @Override
    public void configureRMTP() {
        System.out.println("DisneyPlus: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Aturoização do DisneyPlus, aplicação autorizada");
    }
}
