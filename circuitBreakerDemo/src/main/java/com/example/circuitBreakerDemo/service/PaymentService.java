package com.example.circuitBreakerDemo.service;


import com.example.circuitBreakerDemo.manager.IPaymentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    private IPaymentManager paymentManager;

    @Autowired
    public PaymentService(IPaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    @Override
    public String processPayment() throws Exception{
        return paymentManager.processPayment();
    }
}
