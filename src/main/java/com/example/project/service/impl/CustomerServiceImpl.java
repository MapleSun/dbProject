package com.example.project.service.impl;

import com.example.project.dataobject.Customer;
import com.example.project.repository.CustomerRepository;
import com.example.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public int addCustomer(Customer customer) {
        Customer result = customerRepository.save(customer);
        return result.getCid();
    }
}
