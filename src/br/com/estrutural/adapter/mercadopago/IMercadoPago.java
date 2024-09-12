package br.com.estrutural.adapter.mercadopago;

import br.com.estrutural.adapter.util.Token;

public interface IMercadoPago {
    Token authToken();
    void paymentMercadoPago();
    void receiveMercadoPago();
}
