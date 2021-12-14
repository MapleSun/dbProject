package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Insurance {
    @Id
    private Integer id;

    private String name;

    private String description;

    private Double insCost;

}
