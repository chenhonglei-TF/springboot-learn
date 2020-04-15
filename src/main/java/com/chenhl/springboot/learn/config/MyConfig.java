package com.chenhl.springboot.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean(){
        return new MyConfigBean();
    }
}
