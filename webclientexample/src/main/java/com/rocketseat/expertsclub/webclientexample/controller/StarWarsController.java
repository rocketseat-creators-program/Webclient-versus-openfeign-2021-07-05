package com.rocketseat.expertsclub.webclientexample.controller;


import com.rocketseat.expertsclub.webclientexample.response.VehicleResponse;
import com.rocketseat.expertsclub.webclientexample.webclient.VehicleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class StarWarsController {

    @Autowired
    VehicleClient vehicleClient;


    @GetMapping("/vehicles/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<VehicleResponse> getVehicleById(@PathVariable String id) {
        return vehicleClient.findVehicleById(id);

    }


}
