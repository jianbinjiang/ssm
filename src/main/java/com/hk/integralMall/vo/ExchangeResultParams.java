package com.hk.integralMall.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 兑换结果通知请求参数
 * @author jiangjianbin
 * 创建日期:2016年10月19日 下午3:50:48
 */
@ApiModel("兑换结果通知请求参数")
public class ExchangeResultParams implements Serializable{

	private static final long serialVersionUID = 6902286634803584624L;
	/**
	 * 接口appKey，应用的唯一标识码
	 */
	@ApiModelProperty(value="appKey")
	private String appKey;
	/**
	 * 时间戳
	 */
	@ApiModelProperty(value="时间戳")
	private String timestamp;
	/**
	 * 兑换是否成功
	 */
	@ApiModelProperty(value="兑换是否成功")
	private Boolean success;
	/**
	 * 出错原因
	 */
	@ApiModelProperty(value="出错原因")
	private String errorMessage;
	/**
	 * 兑吧订单号
	 */
	@ApiModelProperty(value="兑吧订单号")
	private String orderNum;
	/**
	 * 订单号
	 */
	@ApiModelProperty(value="订单号")
	private String bizId;
	/**
	 * 签名
	 */
	@ApiModelProperty(value="签名")
	private String sign;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
