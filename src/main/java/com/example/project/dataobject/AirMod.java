package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AirMod {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer airlineId;

    private Integer mid;
}
