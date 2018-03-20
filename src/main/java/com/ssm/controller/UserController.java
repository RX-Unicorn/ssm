package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.serviceImpl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService1;


    @RequestMapping("getUserByID")
    @ResponseBody
    public User getUserByID(int id)
    {
        return userService1.getUserByID(id);
    }


    @RequestMapping("login")
    public String login()
    {
        return "login";
    }
}
