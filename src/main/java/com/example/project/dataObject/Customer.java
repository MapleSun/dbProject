package com.example.project.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;

	private String pType;

	private String cid;

	private String cStreet;

	private String cCity;

	private String cCountry;

	private String cEmail;

	private String cContactNum;

	private String cPassNum;

	private String cERFname;

	private String cERLname;

	private String cEContactNum;

	private String cEContCode;

	private String cType;

}
