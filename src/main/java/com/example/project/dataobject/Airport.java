package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String city;

    private String country;

    private String type;
}
