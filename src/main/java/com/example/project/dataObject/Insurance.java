package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Insurance {

    private Integer pid;

    private String name;

    private String desc;

    private Double insCost;

}
