package br.com.estrutural.bridge.transmissions;

import br.com.estrutural.bridge.plataforms.IPlatform;

public class RecordedLive extends Live{

    public RecordedLive(IPlatform platform){
        super.platform = platform;
    }

    public void gravarLive(){
        System.out.println("Gravando Livre");
    }
}
