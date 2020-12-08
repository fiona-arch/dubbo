package com.jt.util;

import com.jt.pojo.User;

public class ThreadLoalUtil {

    private static ThreadLocal<User> thread=new ThreadLocal<User>();

    public static void setUser(User user){
        thread.set(user);
    }

    public static User getUser(){
        return thread.get();
    }

    public static void remove(){
        thread.remove();
    }

}
