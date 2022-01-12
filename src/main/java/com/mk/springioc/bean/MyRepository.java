package com.mk.springioc.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String getAppName() {
        return "Hello Spring IoC App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }
    
    
}
