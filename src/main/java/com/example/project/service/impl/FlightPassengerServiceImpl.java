package com.example.project.service.impl;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.FlightPassenger;
import com.example.project.dataobject.Passenger;
import com.example.project.repository.CustomerRepository;
import com.example.project.repository.FlightPassengerRepository;
import com.example.project.repository.PassengerRepository;
import com.example.project.service.FlightPassengerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FlightPassengerServiceImpl implements FlightPassengerService {
    @Autowired
    private FlightPassengerRepository flightPassengerRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PassengerRepository passengerRepository;

    List<FlightBO> getFlightListByCid(Integer cid) {
        Customer customer = customerRepository.findByCid(cid);
        Optional<Passenger> passenger = passengerRepository.findById(customer.getPid());
        FlightPassenger flightPassenger = flightPassengerRepository.findByPid();
    }

    private class FlightBO{

    }
}


