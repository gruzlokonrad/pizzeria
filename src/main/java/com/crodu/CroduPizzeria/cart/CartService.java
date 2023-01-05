package com.crodu.CroduPizzeria.cart;

import com.crodu.CroduPizzeria.payment.BlikPayment;
import com.crodu.CroduPizzeria.payment.PaymentMethod;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private PaymentMethod paymentMethod;

    public CartService(BlikPayment blikPayment) {
        this.blikPayment = blikPayment;
    }

    public void payForOrder(){
        /adfsdfsdf
            /sdfsdfsdf


        paymentMethod.pay();

    }
}
