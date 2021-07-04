package com.rocketseat.expertsclub.openfeignexample.controller;


import com.rocketseat.expertsclub.openfeignexample.client.VehicleClient;
import com.rocketseat.expertsclub.openfeignexample.response.VehicleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openfeign")
public class StarWarsController {

    @Autowired
    VehicleClient vehicleClient;


    @GetMapping("/vehicles/{id}")
    public VehicleResponse getVehicleById(@PathVariable String id) {
        return vehicleClient.findVehicleById(id);


    }

}
