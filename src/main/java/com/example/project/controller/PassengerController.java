package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.dataobject.Passenger;
import com.example.project.services.PassengerService;

@Controller
@RequestMapping(value="/passenger")
public class PassengerController {

	@Autowired
	PassengerService passengerService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("passenger_list");
	  List<Passenger> passengerList = passengerService.getAllPassengers();
	  model.addObject("passengerList", passengerList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addpassenger/", method=RequestMethod.GET)
	 public ModelAndView addStudent() {
		 
	  ModelAndView model = new ModelAndView();
	  Passenger passenger = new Passenger();
	  model.addObject("passengerForm", passenger);
	  model.setViewName("passenger_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editPassenger/{id}", method=RequestMethod.GET)
	 public ModelAndView editStudent(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Passenger passenger = passengerService.getPassengerById(id);
	  model.addObject("passengerForm", passenger);
	  model.setViewName("passenger_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addPassenger", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("passengerForm") Passenger passenger) {
		 
	  passengerService.addPassenger(passenger);
	  return new ModelAndView("redirect:/passenger/list");
	  
	 }
	 
	 @RequestMapping(value="/deletePassenger/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  passengerService.deletePassenger(id);
	  return new ModelAndView("redirect:/passenger/list");
	  
	 }

}
