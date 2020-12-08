package com.qianfeng;

import com.qianfeng.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 消费者调用服务
 */
public class Customer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-customer.xml");
        context.start();
        for (int i = 0; i < 4; i++) {
            //获取到远程服务
            IUserService bean = context.getBean(IUserService.class);
            System.out.println( bean.hello());
            System.out.println("获取服务端的信息");
        }
        System.in.read();
    }
}
