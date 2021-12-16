package com.example.project.service.impl;

import com.example.project.dataobject.Passenger;
import com.example.project.repository.PassengerRepository;
import com.example.project.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;


    @Override
    public int addPassenger(Passenger passenger) {
        Passenger result = passengerRepository.save(passenger);
        return result.getId();
    }
}
