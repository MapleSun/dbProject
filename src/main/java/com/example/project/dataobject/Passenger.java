package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "passenger")
public class Passenger implements Serializable {
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

    private Integer cid;
    @Id
    private String type;



}
