package com.qubaba.flyauthserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "com.qubaba.flyauthserver")
@EnableDiscoveryClient
public class FlyAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyAuthServerApplication.class, args);
    }

}
