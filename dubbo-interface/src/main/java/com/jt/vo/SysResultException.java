package com.jt.vo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

//全局异常处理机制
@RestControllerAdvice
public class SysResultException {

	@ExceptionHandler(RuntimeException.class)
	public Object sysResult(Exception e,HttpServletRequest request) {
		e.printStackTrace(); //输出异常信息
		//如果用户传递的参数中有callback参数  则执行跨院的异常处理
		String callback=request.getParameter("callback");
		if(StringUtils.isEmpty(callback)) {
			return SysResult.fail();
		}else {
			return new JSONPObject(callback, SysResult.fail());
		}
		
		
	}
}
