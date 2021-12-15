package com.example.project.repository;

import com.example.project.dataobject.Airport;
import com.example.project.dataobject.AirportFlight;
import com.example.project.dataobject.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AirportFlightRepository extends CrudRepository<AirportFlight, Integer> {
}
