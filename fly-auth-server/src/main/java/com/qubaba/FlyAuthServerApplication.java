package com.qubaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan
public class FlyAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyAuthServerApplication.class, args);
    }

}
