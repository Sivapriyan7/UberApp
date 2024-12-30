package com.project.uber.uberApp.strategies.Implementation;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
