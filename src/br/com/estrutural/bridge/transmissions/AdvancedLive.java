package br.com.estrutural.bridge.transmissions;

import br.com.estrutural.bridge.plataforms.IPlatform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtittles(){
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na Live");
    }
}
