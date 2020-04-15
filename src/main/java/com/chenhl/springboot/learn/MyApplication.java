package com.chenhl.springboot.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    JDWP: Java Debug Wire Protocol,Java调试协议
    服务器端配置 -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5050
    客户端配置：-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=<服务器ip>:505
 */
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        System.out.println(MyApplication.class.getClassLoader());
        SpringApplication.run(MyApplication.class, args);
    }
}
