package com.example.project.service.impl;

import com.example.project.dataobject.*;
import com.example.project.repository.*;
import com.example.project.service.BO.FlightBO;
import com.example.project.service.FlightPassengerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightPassengerServiceImpl implements FlightPassengerService {
    @Autowired
    private FlightPassengerRepository flightPassengerRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private InsuranceRepository insuranceRepository;


    public FlightBO getFlightListByCid(Integer cid) {
        Customer customer = customerRepository.findByCid(cid);
        Optional<Passenger> passenger = passengerRepository.findById(customer.getPid());
        FlightPassenger flightPassenger = flightPassengerRepository.findByPid(passenger.get().getId());
        Optional<Flight> flight = flightRepository.findById(flightPassenger.getFid());
        Optional<Airline> airline = airlineRepository.findById(flight.get().getAirlineId());
        Optional<Airport> airport = airportRepository.findById(airline.get().getAirportId());

        List<Insurance> insurances =

        FlightBO flightBO = new FlightBO(passenger.get(), flight.get(), airline.get(), airport.get());
        return flightBO;
    }


}


