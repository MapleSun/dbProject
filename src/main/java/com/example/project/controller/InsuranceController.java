package com.example.project.controller;

import com.example.project.dataobject.Customer;
import com.example.project.dataobject.Passenger;
import com.example.project.dataobject.User;
import com.example.project.repository.CustomerRepository;
import com.example.project.service.CustomerService;
import com.example.project.service.PassengerService;
import com.example.project.service.SessionService;
import com.example.project.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RequestMapping(path = "insurance")
@Controller    // This means that this class is a Controller
public class InsuranceController {
	@Autowired // This means to get the bean called userRepository
			   // Which is auto-generated by Spring, we will use it to handle the data
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private PassengerService passengerService;

	@Autowired
	private SessionService sessionService;
	@GetMapping(path="/")
	public String hello(Model model) {
		model.addAttribute("message", "world");
		return "home";
	}




}
