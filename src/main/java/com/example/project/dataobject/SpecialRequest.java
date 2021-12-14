package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class SpecialRequest {
    @Id
    private Integer id;

    private String name;
}
