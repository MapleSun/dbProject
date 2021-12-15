package com.example.project.repository;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.Passenger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
    List<Passenger> findAllByCid(Integer cid);
}
