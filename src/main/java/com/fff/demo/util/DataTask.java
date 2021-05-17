package com.fff.demo.util;

import com.alibaba.fastjson.JSONObject;
import com.fff.demo.mapper.*;
import com.fff.demo.pojo.*;
import com.fff.demo.pojo.test.Home;
import com.fff.demo.pojo.test.School;
import com.fff.demo.pojo.test.User;
import com.fff.demo.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataTask implements Job {
    @Autowired
    UserService userService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        String txt = ApiUtil.getApi();
//        JSONObject obj = JSONObject.parseObject(txt);
//        List<MyData> list =obj.getJSONArray("data").toJavaList(MyData.class);


        Date date = new Date();

        User user1 = new User(1,"aa",1.1,true,date, new School("aaa"));
        User user2 = new User(2,"aa",1.1,false,date, new Home("aaa"));
        User user3 = new User(5,"aa",1.1,true,date, new School("aaa"),new Home("aaaa"));
        List<User> listTest = new ArrayList<>();
        listTest.add(user1);
        listTest.add(user2);
        listTest.add(user3);
        System.out.println("start________________________________");
        userService.addUser(listTest);
        System.out.println("end________________________________");


    }
}
