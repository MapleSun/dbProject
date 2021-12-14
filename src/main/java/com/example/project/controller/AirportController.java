package com.example.project.controller;

import com.example.project.dataobject.Airport;
import com.example.project.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/airport")
public class AirportController {
    @Autowired
    private AirportRepository airportRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewAirport (@RequestParam String name
            , @RequestParam String city) {

        Airport n = new Airport();
        n.setName(name);
        //airportRepository.save(n);
        return "Saved";
    }

//    @GetMapping(path="/queryByPage")
//    public @ResponseBody Iterable<Airport> getAllUsers() {
//        return airportRepository.findAll();
//    }
}
