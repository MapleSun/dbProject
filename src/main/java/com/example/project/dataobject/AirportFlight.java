package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "airport_flight")
@Data
@IdClass(AirportFlight.class)

public class AirportFlight implements Serializable {
    @Id
    private Integer airportId;

    @Id
    private Integer flightId;

    private Date arrDeptDate;

    private String portType;
}
