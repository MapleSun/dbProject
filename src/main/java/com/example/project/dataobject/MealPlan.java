package com.example.project.dataobject;

import lombok.Data;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "meal_plan")
@Data
public class MealPlan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    private String name;
}
