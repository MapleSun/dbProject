package com.example.project.dataObject;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AirMod {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer airlineId;

    private Integer mid;
}
