package com.qianfeng.customer;

import com.qianfeng.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerBootXmlApplicationTests {
    @Autowired
    IUserService service;

    @Test
    void contextLoads() {
        System.out.println(service.hello());

    }

}
