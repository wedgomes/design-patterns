package br.com.estrutural.adapter.adapters;

import br.com.estrutural.adapter.payoneer.Payoneer;
import br.com.estrutural.adapter.paypal.IPaypalPayments;
import br.com.estrutural.adapter.util.Token;

public class PayoneerAdapter implements IPaypalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptdando o Payonner utilizando os metodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
