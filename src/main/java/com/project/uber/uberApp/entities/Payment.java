package com.project.uber.uberApp.entities;

import com.project.uber.uberApp.entities.enums.PaymentMethod;
import jakarta.persistence.*;

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;
}
