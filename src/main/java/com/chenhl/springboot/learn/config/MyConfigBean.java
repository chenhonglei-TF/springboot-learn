package com.chenhl.springboot.learn.config;

import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {

    @Value("${myName}")
    private String myName;

    @Value("${myAge}")
    private Integer myAge;


    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Integer getMyAge() {
        return myAge;
    }

    public void setMyAge(Integer myAge) {
        this.myAge = myAge;
    }
}
