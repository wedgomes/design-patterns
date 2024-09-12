package br.com.estrutural.adapter.paypal;

import br.com.estrutural.adapter.util.Token;

public interface IPaypalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
