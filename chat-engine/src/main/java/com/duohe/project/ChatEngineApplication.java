package com.duohe.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChatEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatEngineApplication.class, args);
    }



}
