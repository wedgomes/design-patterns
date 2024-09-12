package br.com.estrutural.bridge.transmissions;

import br.com.estrutural.bridge.plataforms.IPlatform;

public class Live implements ITransmissions{
    protected IPlatform platform;

    public Live(){

    }

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando Transmissão");
    }

    @Override
    public void result() {
        System.out.println("*** ON AIR ***");
    }
}
