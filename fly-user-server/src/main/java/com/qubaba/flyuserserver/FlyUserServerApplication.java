package com.qubaba.flyuserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class FlyUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyUserServerApplication.class, args);
    }

}
