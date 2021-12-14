package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Invoice {
    @Id
    private Integer id;

    private Date date;

    private Double amt;

    private Integer insId;

}
