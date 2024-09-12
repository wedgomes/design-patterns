package br.com.estrutural.bridge;

import br.com.estrutural.bridge.plataforms.FacebookLive;
import br.com.estrutural.bridge.plataforms.IPlatform;
import br.com.estrutural.bridge.plataforms.TwitchTV;
import br.com.estrutural.bridge.plataforms.Youtube;
import br.com.estrutural.bridge.transmissions.AdvancedLive;
import br.com.estrutural.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
    }

    public static void startLive(IPlatform platform){
//        System.out.println("Aguarde...");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();

        System.out.println("Transmissão Avançada");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtittles();
        advancedLive.result();

    }
}
