package com.example.project.controller;

import com.example.project.dataObject.Airport;
import com.example.project.dataObject.User;
import com.example.project.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/airport")
public class AirportController {
    @Autowired
    private AirportRepository airportRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewAirport (@RequestParam String name
            , @RequestParam String city) {

        Airport n = new Airport();
        n.setName(name);
        n.setCity(city);
        airportRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/queryByPage")
    public @ResponseBody Iterable<Airport> getAllUsers() {
        return airportRepository.findAll();
    }
}
