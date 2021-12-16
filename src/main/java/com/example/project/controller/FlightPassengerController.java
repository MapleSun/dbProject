package com.example.project.controller;

import com.example.project.dataobject.Customer;
import com.example.project.service.BO.FlightBO;
import com.example.project.service.FlightPassengerService;
import com.example.project.service.SessionService;
import com.example.project.service.impl.FlightPassengerServiceImpl;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/flight")
public class FlightPassengerController {

    @Autowired
    private FlightPassengerService flightPassengerService;

    @Autowired
    private SessionService sessionService;

    @GetMapping(path = "/list")
    public String flightPage(Model model, HttpServletRequest request) {
        Customer customer = (Customer) sessionService.getCustomer(request);
        FlightBO flightBO = flightPassengerService.getFlightListByCid(customer.getCid());
        model.addAttribute("flight", flightBO);
        return "flightList";
    }

}
