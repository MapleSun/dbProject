package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class BookAgent {

    private Integer pid;

    private String name;

    private String webAddr;

    private Date agentContactNum;

    private String type;
}
