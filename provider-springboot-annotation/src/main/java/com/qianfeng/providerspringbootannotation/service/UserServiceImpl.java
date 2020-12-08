package com.qianfeng.providerspringbootannotation.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qianfeng.service.IUserService;
import org.springframework.stereotype.Component;

@Component//表明受spring管理
@Service//发布服务的组件
public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "springboot+dubbo+annotation";
    }
}
