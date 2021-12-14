package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "flight_passenger")
@Data
public class FlightPassenger {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer fpid;

    private Integer fid;

    private Integer pid;

    private Integer cabid;

    private Integer mpid;

    private Integer srid;

    private String pType;





}
