package com.project.uber.uberApp.strategies;

import com.project.uber.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);
}
