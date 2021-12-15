package com.example.project.repository;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.Flight;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findByCid(Integer cid);

}
