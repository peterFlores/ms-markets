package com.pflores.msmarkets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMarketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsMarketsApplication.class, args);
    }

}
