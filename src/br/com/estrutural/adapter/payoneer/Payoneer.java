package br.com.estrutural.adapter.payoneer;

import br.com.estrutural.adapter.util.Token;

public class Payoneer implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via PAYONEER");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via PAYONEER");
    }
}
