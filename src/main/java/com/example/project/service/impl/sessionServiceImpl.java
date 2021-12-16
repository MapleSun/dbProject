package com.example.project.service.impl;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.User;
import com.example.project.service.SessionService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class sessionServiceImpl implements SessionService {
    @Override
    public void setUser(HttpServletRequest request, User user) {
        request.getSession().setAttribute("user", user);
    }

    @Override
    public Object getUser(HttpServletRequest request) {
         return request.getSession().getAttribute("user");
    }

    @Override
    public void setCustomer(HttpServletRequest request, Customer customer) {
        request.getSession().setAttribute("customer", customer);
    }

    @Override
    public Object getCustomer(HttpServletRequest request) {
        return request.getSession().getAttribute("customer");
    }
}
