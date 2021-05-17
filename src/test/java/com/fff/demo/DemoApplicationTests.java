package com.fff.demo;

import com.alibaba.fastjson.JSONObject;
import com.fff.demo.mapper.DataMapper;
import com.fff.demo.mapper.UserMapper;
import com.fff.demo.pojo.*;
import com.fff.demo.pojo.test.*;
import com.fff.demo.service.UserService;
import com.fff.demo.util.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;
    @Autowired
    DataMapper dataMapper;
    @Autowired
    UserService userService;

    @Test
    void getData() {
        String txt = ApiUtil.getApi();
        JSONObject obj = JSONObject.parseObject(txt);
        List<MyData> list =obj.getJSONArray("data").toJavaList(MyData.class);



    }
    @Test
    void test(){
        Date date = new Date();

        User user1 = new User(1,"aa",1.1,true,date, new School("aaa"));
        User user2 = new User(2,"aa",1.1,false,date, new Home("aaa"));
        User user3 = new User(5,"aa",1.1,true,date, new School("aaa"),new Home("aaaa"));
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        userService.addUser(list);

    }
    @Test
    void quartzTest(){
        TimeUtil timeUtil = new TimeUtil();
        try {
            timeUtil.go();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


































