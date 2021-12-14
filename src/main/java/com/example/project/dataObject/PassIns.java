package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class PassIns {

    private Integer pid;

    private Integer insId;

    private String type;

    private Date buyDate;
}
