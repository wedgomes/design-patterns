package br.com.estrutural.adapter.payoneer;

import br.com.estrutural.adapter.util.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();

}
