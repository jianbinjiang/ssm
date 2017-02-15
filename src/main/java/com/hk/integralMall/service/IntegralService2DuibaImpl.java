package com.hk.integralMall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hk.integralMall.mapper.integral.IntegralConsumptionMapper;
import com.hk.integralMall.mapper.integral.IntegralPreConsumptionMapper;
import com.hk.integralMall.mapper.integral.IntegralUserMapper;
import com.hk.integralMall.vo.CreditConsumeParams;
import com.hk.integralMall.vo.ExchangeResultParams;
import com.hk.integralMall.vo.IntegralResponse;

/**
 * 
 * @author jiangjianbin 
 * 创建日期:2016年10月18日 下午2:41:29 
 * 积分商城duiba服务层
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IntegralService2DuibaImpl {

	/**
	 * @Fields integralUser : 用户积分
	 */
	@Autowired
	private IntegralUserMapper integralUser;

	/**
	 * @Fields preConsumption : 用户预消费积分记录
	 */
	@Autowired
	private IntegralPreConsumptionMapper integralPreConsumption;

	/**
	 * @Fields preConsumption : 用户消费积分记录
	 */
	@Autowired
	private IntegralConsumptionMapper  integralConsumption;
	
	
	/**
	 * duiba发送请求扣积分
	 */
	public IntegralResponse consumIntegral(CreditConsumeParams integralPreConsumptionParam) {
		
		return null;
	}
	
	
	
    /**
     * 兌換結果通知
     */
	public String exchangeResultInform(ExchangeResultParams param) {
		
		return "";
	}
	
	
	/**
	 * 生成免登陆的url
	 * @param uid
	 * @param redirect
	 * @return
	 */
	public String buildLoginUrl(String uid,String userName,String telPhone,String yikeCode,String redirect){
		
		return "";
	}
}
