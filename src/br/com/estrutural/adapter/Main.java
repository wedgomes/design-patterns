package br.com.estrutural.adapter;

import br.com.estrutural.adapter.adapters.MercadoPagoAdapter;
import br.com.estrutural.adapter.adapters.PayoneerAdapter;
import br.com.estrutural.adapter.payoneer.IPayonnerPayments;
import br.com.estrutural.adapter.payoneer.Payoneer;
import br.com.estrutural.adapter.paypal.IPaypalPayments;
import br.com.estrutural.adapter.paypal.Paypal;

public class Main {
    public static void main(String[] args) {
//        IPayonnerPayments payment = new Payoneer();
//        payment.sendPayment();
//        payment.receivePayment();

//
//        IPaypalPayments payment = new PayoneerAdapter(new Payoneer());
//        payment.paypalPayment();
//        payment.paypalReceive();

        IPayonnerPayments payment = new MercadoPagoAdapter(new Payoneer());
        payment.sendPayment();
        payment.receivePayment();
    }
}
