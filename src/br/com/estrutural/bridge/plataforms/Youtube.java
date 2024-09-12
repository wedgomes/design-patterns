package br.com.estrutural.bridge.plataforms;

public class Youtube implements IPlatform{
    public Youtube(){
        configureRMTP();
        System.out.println("Youtube: Tramissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: configuração broadincasting");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação");
    }
}
