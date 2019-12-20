package com.joy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joy.entity.User;
import com.joy.mapper.UserMapper;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUser(int id){
        return userMapper.getUser(id);
    }
}