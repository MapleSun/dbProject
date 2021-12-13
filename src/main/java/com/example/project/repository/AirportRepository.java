package com.example.project.repository;

import com.example.project.dataObject.Airport;
import com.example.project.dataObject.User;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Integer> {
}
