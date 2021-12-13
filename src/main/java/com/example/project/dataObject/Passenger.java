package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String fname;

    private String lname;

    private String nationality;

    private String gender;

    private Integer passportNumber;

    private Date passExpDate;

    private Date DOB;

    private String type;



}
