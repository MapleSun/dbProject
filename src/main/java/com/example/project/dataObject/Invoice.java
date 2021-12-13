package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Invoice {

    private Integer id;

    private Date date;

    private String desc;

    private Double amt;

    private Integer insId;

}
