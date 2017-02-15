package com.hk.integralMall.controller;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.hk.integralMall.utils.CommonUtils;

/**
 * 
 * @ClassName: LogAspect
 * @Description: 日志记录AOP实现
 * @author zhongjiandong
 * @date 2016年09月08日 下午1:51:59
 */
@Aspect
@Component
public class LogAspect {

	private final Logger log = Logger.getLogger("LogAspect");

	/**
	 * @Fields methodName : 请求方法
	 */
	private String methodName = null;

	/**
	 * @Fields inputParam : 方法入参数
	 */
	private Object[] inputParam = null;

	/**
	 * @Fields outputParam : 方法出参
	 */
	private Object outputParam = null;

	
	/**
	 * @Title: doAround
	 * @Description: integralMallAPI环绕触发
	 * @param
	 * @return
	 * @throws Throwable
	 */
	@Around("within(@org.springframework.web.bind.annotation.RestController *)")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
		methodName = joinPoint.getSignature().toLongString();
		inputParam = joinPoint.getArgs();
		outputParam = joinPoint.proceed();
		log.info("\n methodName：" + methodName + " param：" + CommonUtils.objectMapper.writeValueAsString(inputParam) + ";"
				+ "\n result：" + CommonUtils.objectMapper.writeValueAsString(outputParam));
		return outputParam;
	}
}