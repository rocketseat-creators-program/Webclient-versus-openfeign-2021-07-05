package com.rocketseat.expertsclub.openfeignexample.client;


import com.rocketseat.expertsclub.openfeignexample.response.VehicleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "vehicles", url = "https://swapi.dev/api/")
public interface VehicleClient {

    @RequestMapping(method = RequestMethod.GET, value = "vehicles/{id}" )
    VehicleResponse findVehicleById(@PathVariable(name = "id") String id);

}
