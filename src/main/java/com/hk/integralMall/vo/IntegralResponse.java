package com.hk.integralMall.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/**
 * 
 * @author jiangjianbin
 * 创建日期:2016年10月18日 下午5:00:35
 * 返回积分商城的参数值
 * 
 */

@ApiModel(value = "返回积分商城的参数值", description = "响应参数")
public class IntegralResponse implements Serializable{

	private static final long serialVersionUID = -4933251588005345825L;

	//查询状态
	private String status = "ok";
	
	//出错原因
	private String errorMessage = "";
	
	//订单号
	private String bizId;
	
	//用户积分余额
	private long credits;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public long getCredits() {
		return credits;
	}

	public void setCredits(long credits) {
		this.credits = credits;
	}

}
