package com.project.uber.uberApp.strategies.Implementation;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStarategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
