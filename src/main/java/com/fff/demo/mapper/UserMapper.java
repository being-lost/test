package com.fff.demo.mapper;

import com.fff.demo.pojo.test.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {            //测试用

    User selectUserById(Integer id);
    void insertUser(User user);
    void insertUserList(List<User> list);
    void updateUser(User user);

    void insertSchool(School school);
    void updateSchool(School school);
    void insertSchoolList(List<School> list);

    void insertHome(Home home);
    void insertHomeList(List<Home> list);
    void updateHome(Home home);
    //遍历list，判断school是否为空，把id赋给school外键
    //判断id是否重复，没重复addUser（），school不为空addSchool————重复了，
    //




}
