package com.ssm.service;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.serviceImpl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Cacheable("getUserById")
    public User getUserByID(int id) {
        return userMapper.getUser(id);
    }
}
