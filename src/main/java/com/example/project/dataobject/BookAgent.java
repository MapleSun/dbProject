package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book_agent")
@Data
public class BookAgent implements Serializable {
    @Id
    private Integer pid;

    private String name;

    private String webAddr;

    private String agentContactNum;
    @Id
    private String pType;
}
