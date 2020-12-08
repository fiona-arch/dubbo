package com.jt.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {
    public static final ObjectMapper MAPPER=new ObjectMapper();

    //对象转化为json
    public static String toJson(Object obj){
        String result=null;

        try {
            result=MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return result;
    }

    //json转化为对象
    public static <T>T jsonToObject(String json,Class<T> targetClass){
        T t=null;

        try {
            t=MAPPER.readValue(json,targetClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return t;
    }

}
