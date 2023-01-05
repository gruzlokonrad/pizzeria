package com.crodu.CroduPizzeria.payment;

import org.springframework.stereotype.Service;

@Service
public class BlikPayment implements PaymentMethod{

    String apiKey = "sdfsdfsasdbet5y34g35h35br";

    private void payWithBLik(Address address, PhoneNumber phoneNumber, Buba a){
        BlikLib b = new BlikLib();
        b.pay(address,phoneNumber,a);
    }

    @Override
    public void pay(Address address, PhoneNumber phoneNumber, Buba a) {
        payWithBLik( address,  phoneNumber,  a)
    }
}
