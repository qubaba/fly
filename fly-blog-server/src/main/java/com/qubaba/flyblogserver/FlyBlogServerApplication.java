package com.qubaba.flyblogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qubaba.flyblogserver.dao")
public class FlyBlogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyBlogServerApplication.class, args);
    }


}
