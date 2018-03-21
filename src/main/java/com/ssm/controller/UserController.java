package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.serviceImpl.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
