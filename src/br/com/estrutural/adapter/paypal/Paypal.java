package br.com.estrutural.adapter.paypal;

import br.com.estrutural.adapter.util.Token;

public class Paypal implements IPaypalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via PAYPAL");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via PAYPAL");
    }
}
