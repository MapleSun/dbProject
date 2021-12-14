package com.example.project.repository;

import com.example.project.dataobject.Airport;
import org.springframework.data.repository.CrudRepository;


public interface AirportRepository extends CrudRepository<Airport, Integer> {
}
