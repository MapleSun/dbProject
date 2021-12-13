package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Membership {
	private Integer pid;

	private String name;

	private String asscAirline;

	private Date startDate;

	private Date endDate;

	private String type;

}
