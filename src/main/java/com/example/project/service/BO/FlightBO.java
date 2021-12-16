package com.example.project.service.BO;

import com.example.project.dataobject.Airline;
import com.example.project.dataobject.Airport;
import com.example.project.dataobject.Flight;
import com.example.project.dataobject.Passenger;
import lombok.Data;

@Data
public class FlightBO{
    Passenger passenger;
    Flight flight;
    Airline airline;
    Airport airport;

    public FlightBO(Passenger passenger, Flight flight, Airline airline, Airport airport) {
        this.passenger = passenger;
        this.flight = flight;
        this.airline = airline;
        this.airport = airport;
    }
}
