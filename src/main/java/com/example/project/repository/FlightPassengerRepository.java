package com.example.project.repository;

import com.example.project.dataobject.Airport;
import com.example.project.dataobject.FlightPassenger;
import com.example.project.dataobject.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FlightPassengerRepository extends CrudRepository<FlightPassenger, Integer> {
    FlightPassenger findByFpid(Integer fpid);

    FlightPassenger findByFid(Integer fid);

    FlightPassenger findByPid(Integer pid);
}
