package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.RideDTO;
import com.project.uber.uberApp.dto.RiderDTO;

import java.util.List;

public interface DriverService {

    RiderDTO acceptRide(Long rideId);

    RideDTO startRide(Long rideId);

    RideDTO cancelRide(Long rideId);

    RideDTO endRide(Long rideId);

    RiderDTO rateRider(Long rider);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();

}
