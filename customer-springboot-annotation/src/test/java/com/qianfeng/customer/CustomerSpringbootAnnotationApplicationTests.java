package com.qianfeng.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianfeng.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerSpringbootAnnotationApplicationTests {

    @Reference
    IUserService service;

    @Test
    void contextLoads() {
        for (int i = 0; i < 4; i++) {
            System.out.println(service.hello());
        }

    }

}
