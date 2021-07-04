package com.rocketseat.expertsclub.openfeignexample.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class VehicleResponse {

    private String cargo_capacity;

    private String consumables;

    private String crew;

    private String model;

    private String name;

    private String passengers;

    private String vehicle_class;
















}
