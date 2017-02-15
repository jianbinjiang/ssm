package com.hk.integralMall.controller.integral;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hk.integralMall.service.IntegralService2DuibaImpl;
import com.hk.integralMall.service.IntegralServiceImpl;
import com.hk.integralMall.vo.CreditConsumeParams;
import com.hk.integralMall.vo.ExchangeResultParams;
import com.hk.integralMall.vo.IntegralResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * 
 * @author s-na
 *
 */
@RestController
@RequestMapping("/duibaInvoke")
@Api(value = "医客-兑吧调用服务API", description = "兑吧服务API入口")
public class Integral2DuiBaControl {
	
	@Autowired
    private IntegralService2DuibaImpl integralService2DuibaImpl;
	
	@Autowired
	private IntegralServiceImpl integralService;
	
	
	@ApiOperation(value = "扣除用户积分",httpMethod="GET")
	@RequestMapping(value = "/consumIntegral", method = RequestMethod.GET)
	public IntegralResponse consumIntegral(@ApiParam(value="入参实体",required=true) CreditConsumeParams creditConsumeParams) throws Exception{ 
		return integralService2DuibaImpl.consumIntegral(creditConsumeParams);
	}
	
	
	
	@ApiOperation(value = "兑换结果通知",httpMethod="GET")
	@RequestMapping(value = "/exchange", method = RequestMethod.GET)
	public String exchangeResultInform(@ApiParam(value="入参实体",required=true) ExchangeResultParams param){
		return integralService2DuibaImpl.exchangeResultInform(param);
	}
	
	
	
	@ApiOperation(value = "用户签到", httpMethod  = "GET")
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public Map<String,Object> userSigned(
			@ApiParam(value = "用户ID", required = true)@RequestParam String uid,
			@ApiParam(value = "token唯一性校验码", required = true)@RequestParam String token) throws JsonProcessingException{
		return integralService.userPastOperation(uid,token);
	}
	
}
