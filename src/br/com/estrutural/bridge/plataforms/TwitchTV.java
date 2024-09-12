package br.com.estrutural.bridge.plataforms;

public class TwitchTV implements IPlatform{

    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: Tramissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: configuração RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal");
    }
}
