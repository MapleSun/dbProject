package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Date date;

    private String method;

    private Double amt;

    private String fName;

    private String lName;

    @Id
    private Integer invoiceId;



}
