package com.jt.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {

    //删除cookie
    public static void deleteCookie(HttpServletResponse response,String cookieName,
                                    String domain,String path){
        Cookie cookie=new Cookie(cookieName,null);
        cookie.setMaxAge(0);
        cookie.setDomain(domain);
        cookie.setPath(path);
        response.addCookie(cookie);
    }

    //根据cookie名称获取cookie对象
    public static Cookie getCookie(String cookieName, HttpServletRequest request){
        Cookie []cookies=request.getCookies();
        if(cookies.length>0){
            for(Cookie cookie:cookies){
                if(cookieName.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }

    //根据cookie名称获取cookie得值
    public static String getCookieValue(String cookieName,HttpServletRequest request){
        Cookie []cookies=request.getCookies();
        if(cookies.length>0){
            String ticket=null;
            for(Cookie cookie:cookies){
                if(cookieName.equals(cookie.getName())){
                    ticket=cookie.getValue();
                    return ticket;
                }
            }
        }
        return null;
    }
}
