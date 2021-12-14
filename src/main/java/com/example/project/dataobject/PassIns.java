package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class PassIns implements Serializable {
    @Id
    private Integer pid;
    @Id
    private Integer insId;
    @Id
    private String type;

    private Date buyDate;
}
