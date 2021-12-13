package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class AirportFlight {

    private Integer airportId;

    private Integer flightId;

    private Date arrDeptDate;

    private String portType;
}
