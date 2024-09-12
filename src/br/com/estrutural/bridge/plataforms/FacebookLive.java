package br.com.estrutural.bridge.plataforms;

public class FacebookLive implements IPlatform{

    public FacebookLive(){
        configureRMTP();
        System.out.println("Tramissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Autorizando Facebook, autorizando aplicação");
    }
}
