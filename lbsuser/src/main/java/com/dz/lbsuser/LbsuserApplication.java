package com.dz.lbsuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LbsuserApplication {

    public static void main(String[] args) {
        SpringApplication.run (LbsuserApplication.class, args);
    }

}
