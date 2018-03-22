package com.ssm.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class User implements Serializable{
    @ApiModelProperty(value = "用户ID")
    private int id;
    @ApiModelProperty(value = "用户名称")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
