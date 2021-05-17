package com.fff.demo;

import com.alibaba.fastjson.JSONObject;
import com.fff.demo.pojo.MyData;
import com.fff.demo.pojo.test.Home;
import com.fff.demo.pojo.test.School;
import com.fff.demo.pojo.test.User;
import com.fff.demo.service.UserService;
import com.fff.demo.util.ApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableScheduling
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    UserService userService;

//    @Scheduled(cron = "00 00 1 * * ?")
//    public void myTask(){
//        String txt = ApiUtil.getApi();
//        JSONObject obj = JSONObject.parseObject(txt);
//        List<MyData> list =obj.getJSONArray("data").toJavaList(MyData.class);
//        for(MyData myData:list){
//            System.out.println(myData);
//        }
//        /*
//        上面能成功获取数据集合，但是字段太多，所以用测试数据定时存入数据库
//        User里有各种数据类型，和School，Home两个引用类型
//        School和Home两张表各有一个外键关联User的主键
//
//        之前httpclient、jsoup（没用到）、quartz（没用到）都没接触过
//        springboot、json不熟练
//        mybatis-plus也没用上
//        加上数据字段多，以及各种踩坑，浪费了很多时间。。。
//
//
//         */
//        Date date = new Date();
//        User user1 = new User(1,"aa",1.1,true,date, new School("aaa"));
//        User user2 = new User(2,"aa",1.1,false,date, new Home("aaa"));
//        User user3 = new User(5,"aa",1.1,true,date, new School("aaa"),new Home("aaaa"));
//        List<User> listTest = new ArrayList<>();
//        listTest.add(user1);
//        listTest.add(user2);
//        listTest.add(user3);
//        System.out.println("执行定时任务--------------------");
//        userService.addUser(listTest);
//        System.out.println("执行定时任务--------------------");
//    }

}
