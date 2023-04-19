package com.sweetline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sweetline")
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableWebMvc
public class AviaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviaApplication.class, args);
    }

}
