package com.quartz.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzDemoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzDemoTaskApplication.class, args);
    }

}
