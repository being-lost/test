package com.fff.demo.pojo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private Integer id;
    private String name;

    private Integer user_school;//外键

    public School(Integer id, Integer user_school) {
        this.id = id;
        this.user_school = user_school;
    }

    public School(String name) {
        this.name = name;
    }

    public School(Integer user_school) {

        this.user_school=user_school;
    }
    public School( String name,Integer user_school) {
        this.user_school=user_school;
        this.name = name;
    }
}
