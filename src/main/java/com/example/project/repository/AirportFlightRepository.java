package com.example.project.repository;

import com.example.project.dataObject.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportFlightRepository extends CrudRepository<Airport, Integer> {
}
