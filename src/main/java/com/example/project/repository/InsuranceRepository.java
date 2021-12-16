package com.example.project.repository;

import com.example.project.dataobject.Airline;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface InsuranceRepository extends CrudRepository<Airline, Integer> {
}
