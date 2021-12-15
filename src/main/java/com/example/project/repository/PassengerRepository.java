package com.example.project.repository;

import com.example.project.dataobject.Passenger;

import org.springframework.data.repository.CrudRepository;


public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}
