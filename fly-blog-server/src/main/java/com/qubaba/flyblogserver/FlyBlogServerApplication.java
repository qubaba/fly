package com.qubaba.flyblogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.qubaba.flyblogserver.dao")
public class FlyBlogServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FlyBlogServerApplication.class, args);
    }


}
