package com.qianfeng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class ProviderSpringbootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderSpringbootXmlApplication.class, args);
    }

}
