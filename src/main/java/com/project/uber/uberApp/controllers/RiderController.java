package com.project.uber.uberApp.controllers;


import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.services.RiderService;
import lombok.Getter;
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
        System.out.println("constructor running in RiderController");
        this.riderService = riderService;
    }

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestRide(@RequestBody String body) {
        System.out.println("Raw JSON body: " + body);
        return null;
    }

//    public ResponseEntity<RideRequestDTO> requestRide(@RequestBody RideRequestDTO rideRequestDTO){
//        System.out.println("ride request data");
//        System.out.println(rideRequestDTO);
//        return ResponseEntity.ok(riderService.requestRide(rideRequestDTO));
//    }

    @GetMapping
    public void requestRide(){
        System.out.println("in the get Mapping");
    }
}
