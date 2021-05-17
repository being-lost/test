package com.fff.demo.pojo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Home {
    private Integer id;
    private String name;

    private Integer user_home;//外键

    public Home(String name,Integer user_home) {
        this.user_home=user_home;
        this.name = name;
    }

    public Home(Integer id, Integer user_home) {
        this.id = id;
        this.user_home = user_home;
    }

    public Home(String name) {
        this.name = name;
    }

    public Home(Integer user_home) {
        this.user_home=user_home;


    }
}
