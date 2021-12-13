package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Payment {

    private Integer id;

    private Date date;

    private String method;

    private Double amt;

    private String fName;

    private String lName;

    private Integer invoiceId;



}
