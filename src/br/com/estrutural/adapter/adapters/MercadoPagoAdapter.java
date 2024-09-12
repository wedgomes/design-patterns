package br.com.estrutural.adapter.adapters;

import br.com.estrutural.adapter.mercadopago.IMercadoPago;
import br.com.estrutural.adapter.payoneer.IPayonnerPayments;
import br.com.estrutural.adapter.payoneer.Payoneer;
import br.com.estrutural.adapter.util.Token;

public class MercadoPagoAdapter implements IPayonnerPayments {
    private Token token;
    private Payoneer payoneer;

    public MercadoPagoAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payonner utilizando os métodos padrões do MercadoPago");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void receivePayment() {
        this.payoneer.receivePayment();
    }
}
