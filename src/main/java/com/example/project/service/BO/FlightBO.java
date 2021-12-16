package com.example.project.service.BO;

import com.example.project.dataobject.*;
import lombok.Data;

import java.util.List;

@Data
public class FlightBO{
    Passenger passenger;
    Flight flight;
    Airline airline;
    Airport airport;
    List<Insurance> insurances;

    public FlightBO(Passenger passenger, Flight flight, Airline airline, Airport airport, List<Insurance> insurances) {
        this.passenger = passenger;
        this.flight = flight;
        this.airline = airline;
        this.airport = airport;
        this.insurances = insurances;
    }
}
