package com.fff.demo.pojo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor

public class User {
    private Integer id;
    private String name;
    private Double money;
    private Boolean isHealthy;
    private Date date;

    private School school;
    private Home home;

    public User(Integer id, String name, Double money, Boolean isHealthy, Date date, Home home) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.isHealthy = isHealthy;
        this.date = date;
        this.home = home;
    }

    public User(Integer id, String name, Double money, Boolean isHealthy, Date date, School school, Home home) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.isHealthy = isHealthy;
        this.date = date;
        this.school = school;
        this.home = home;
    }

    public User(Integer id, String name, Double money, Boolean isHealthy, Date date, School school) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.isHealthy = isHealthy;
        this.date = date;
        this.school = school;
    }
}
