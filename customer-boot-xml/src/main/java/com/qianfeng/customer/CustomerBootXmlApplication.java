package com.qianfeng.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-customer.xml")
public class CustomerBootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerBootXmlApplication.class, args);
    }

}
