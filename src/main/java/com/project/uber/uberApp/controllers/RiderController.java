package com.project.uber.uberApp.controllers;


import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rider")
//@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    public RiderController(RiderService riderService)
    {
        this.riderService = riderService;
    }

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestRide(@RequestBody RideRequestDTO rideRequestDTO){
        System.out.println("in the request ride section");
        return ResponseEntity.ok(riderService.requestRide(rideRequestDTO));
    }
}
