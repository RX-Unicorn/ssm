package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.serviceImpl.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService1;


    @ApiOperation(value = "根据ID获取用户",notes = "test根据ID获取用户")
    @ApiImplicitParam(name = "id",value = "用户d",required = true,paramType = "query",dataType = "int")
    @RequestMapping(value = "getUserByID",method = RequestMethod.GET)
    @ResponseBody
    public User getUserByID(int id)
    {
        return userService1.getUserByID(id);
    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }


    @ApiOperation(value = "获取用户",notes = "测试获取用户")
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @ResponseBody
    public User getUser(@RequestBody @ApiParam(name = "用户",value = "用户信息") User user)
    {
        return user;
    }
}
