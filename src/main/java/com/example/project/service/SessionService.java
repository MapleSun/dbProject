package com.example.project.service;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.User;

import javax.servlet.http.HttpServletRequest;

public interface SessionService {
    void setUser(HttpServletRequest request, User user);
    Object getUser(HttpServletRequest request);
    void setCustomer(HttpServletRequest request, Customer customer);
    Object getCustomer(HttpServletRequest request);

}
