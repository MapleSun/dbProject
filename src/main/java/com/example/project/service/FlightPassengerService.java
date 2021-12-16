package com.example.project.service;

import com.example.project.service.BO.FlightBO;

public interface FlightPassengerService {
    FlightBO getFlightListByCid(Integer cid);
}
