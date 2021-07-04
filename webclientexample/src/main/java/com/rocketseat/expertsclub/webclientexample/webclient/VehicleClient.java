package com.rocketseat.expertsclub.webclientexample.webclient;


import com.rocketseat.expertsclub.webclientexample.response.VehicleResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;



@Service
public class VehicleClient {

    private final WebClient webClient;

    public VehicleClient(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://swapi.dev/api/").build();
    }


    public Mono<VehicleResponse> findVehicleById(String id) {
        return webClient.get()
                .uri("vehicles/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(VehicleResponse.class);
    }

}

