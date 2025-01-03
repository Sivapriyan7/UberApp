package com.project.uber.uberApp.strategies.Implementation;

import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {


    @Override
    public List<Driver> findMatchingDrivers(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
