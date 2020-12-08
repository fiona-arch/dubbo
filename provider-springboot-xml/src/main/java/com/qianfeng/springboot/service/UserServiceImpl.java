package com.qianfeng.springboot.service;

import com.qianfeng.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "dubbo+springboot";
    }
}
