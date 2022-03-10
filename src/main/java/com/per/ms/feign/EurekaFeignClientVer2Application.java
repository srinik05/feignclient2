package com.per.ms.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaFeignClientVer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientVer2Application.class, args);
        System.out.println("Feign Client version 2 started....!");
    }

}
