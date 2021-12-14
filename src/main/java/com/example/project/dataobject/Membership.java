package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Membership implements Serializable {
	@Id
	private Integer pid;

	private String name;

	private String asscAirline;

	private Date startDate;

	private Date endDate;
	@Id
	private String type;

}
