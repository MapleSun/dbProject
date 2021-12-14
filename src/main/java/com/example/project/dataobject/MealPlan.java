package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "meal_plan")
@Data
public class MealPlan {
    @Id
    private Integer id;


    private String name;
}
