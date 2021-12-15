package com.example.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.dataobject.Passenger;
import com.example.project.repository.PassengerRepository;

@Service
@Transactional
public class PassengerServiceImplementation implements PassengerService{
	@Autowired
	PassengerRepository passengerRepository;
	
	
	@Override
	public List<Passenger> getAllPassengers() {
		return (List<Passenger>) passengerRepository.findAll();
	}

	@Override
	public Passenger getPassengerById(int id) {
		return passengerRepository.findById(id).get();
	}

	@Override
	public void addPassenger(Passenger passenger) {
		passengerRepository.save(passenger);
	}

	@Override
	public void deletePassenger(int id) {
		passengerRepository.deleteById(id);
	}

}
