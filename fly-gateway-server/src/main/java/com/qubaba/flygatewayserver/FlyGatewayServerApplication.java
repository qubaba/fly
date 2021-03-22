package com.qubaba.flygatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlyGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyGatewayServerApplication.class, args);
    }

}
