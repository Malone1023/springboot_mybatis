package com.joy.mapper;

import org.springframework.stereotype.Repository;

import com.joy.entity.User;


@Repository
public interface UserMapper {

    User getUser(int id);
    
}
