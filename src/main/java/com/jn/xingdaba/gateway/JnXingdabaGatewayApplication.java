package com.jn.xingdaba.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JnXingdabaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JnXingdabaGatewayApplication.class, args);
    }

}
