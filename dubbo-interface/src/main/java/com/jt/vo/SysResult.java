package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SysResult{
    private Integer status;
    private String message;
    private Object data;

    public static SysResult success(Object data){
        return new SysResult(200,"成功",data);
    }

    public static SysResult success(){
        return new SysResult(200,"成功",null);
    }

    public static SysResult success(String message,Object data){
        return new SysResult(200,message,data);
    }

    public static SysResult fail(){
        return new SysResult(201,"你写得这是啥啊",null);
    }

}
