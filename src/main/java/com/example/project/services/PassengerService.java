package com.example.project.services;

import java.util.List;

import com.example.project.dataobject.Passenger;

public interface PassengerService {
	public List<Passenger> getAllPassengers();
	 
	public Passenger getPassengerById(int id);
	 
	public void addPassenger(Passenger passenger);
	 
	public void deletePassenger(int id);

}
