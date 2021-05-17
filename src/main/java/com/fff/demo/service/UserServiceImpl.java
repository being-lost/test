package com.fff.demo.service;

import com.fff.demo.mapper.UserMapper;
import com.fff.demo.pojo.test.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    /*
    遍历每一个User
        搜索id判断是否存在
            不存在，添加User，并且School，Home赋上外键值存入数据库，判断是否为空是为了避免空指针异常
            存在，更新数据，避免数据重复
     */
    @Override
    public void addUser(List<User> list) {
        for (User user : list) {
            School school = user.getSchool();
            Home home = user.getHome();
            if (userMapper.selectUserById(user.getId()) == null) {
                userMapper.insertUser(user);
                if (school != null) {
                    school.setId(user.getId());
                    school.setUser_school(user.getId());
                    userMapper.insertSchool(school);
                }else{
                    user.setSchool(new School(user.getId(),user.getId()));
                    userMapper.insertSchool(user.getSchool());
                }
                if (home != null) {
                    home.setId(user.getId());
                    home.setUser_home(user.getId());
                    userMapper.insertHome(home);
                }else{
                    user.setHome(new Home(user.getId(),user.getId()));
                    userMapper.insertHome(user.getHome());
                }
            } else {
                userMapper.updateUser(user);
                if (school != null) {
                    school.setUser_school(user.getId());
                    userMapper.updateSchool(school);
                }else {
                    user.setSchool(new School(user.getId()));
                    userMapper.updateSchool(user.getSchool());
                }
                if (home != null) {
                    home.setUser_home(user.getId());
                    userMapper.updateHome(home);
                }else {
                    user.setHome(new Home(user.getId()));
                    userMapper.updateHome(user.getHome());
                }
            }


        }
    }
}
