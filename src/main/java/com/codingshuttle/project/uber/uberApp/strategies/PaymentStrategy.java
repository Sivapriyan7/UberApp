package com.codingshuttle.project.uber.uberApp.strategies;

import com.codingshuttle.project.uber.uberApp.entities.Payment;

public interface PaymentStrategy {

    void processPayment(Payment payment);

}
