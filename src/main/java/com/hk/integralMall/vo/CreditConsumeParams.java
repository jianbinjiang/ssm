package com.hk.integralMall.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 积分扣除请求参数
 * 
 * @author jiangjianbin 创建日期:2016年10月19日 下午2:51:18
 */
@ApiModel("扣除积分请求参数VO")
public class CreditConsumeParams implements Serializable {

	private static final long serialVersionUID = 7793397963681590083L;
	/**
	 * 接口appKey，应用的唯一标识
	 */
	@ApiModelProperty(value="appKey")
	private String appKey;
	
	/**
	 * 时间戳
	 */
	@ApiModelProperty(value="时间戳")
	private String timestamp;
	/**
	 * 消耗积分数
	 */
	@ApiModelProperty(value="消耗积分数")
	private int credits; 
	/**
	 * 兑吧订单号
	 */
	@ApiModelProperty(value="兑吧订单号")
	private String orderNum = "";
	
	/**
	 * 描述
	 */
	@ApiModelProperty(value="描述")
	private String description = "";
	/**
	 *类型 
	 */
	@ApiModelProperty(value="描述类型 ")
	private String type = "";
	/**
	 * 面值，分为单位
	 */
	@ApiModelProperty(value="面值，分为单位 ")
	private Integer facePrice = 0;
	/**
	 * 实际扣款，分为单位
	 */
	@ApiModelProperty(value="实际扣款，分为单位 ")
	private Integer actualPrice = 0;// 实际扣款，分为单位
	/**
	 * 用户id
	 */
	@ApiModelProperty(value="用户id ")
	private String uid = "";
	
	/**
	 * 用户兑换时使用的ip地址，有可能为空
	 */
	@ApiModelProperty(value="用户兑换时使用的ip地址 ")
	private String ip = "";// 用户兑换时使用的ip地址，有可能为空

	/**
	 * 是否需要审核
	 */
	@ApiModelProperty(value="是否需要审核")
	private boolean waitAudit;
	
	/**
	 * 详情参数，不同的类型，返回不同的内容，中间用英文冒号分隔。(支付宝类型带中文，请用utf-8进行解码) 实物商品：
	 * 返回收货信息(姓名:手机号:省份:城市:区域:详细地址)、支付宝：返回账号信息(支付宝账号:实名)、话费：返回手机号、QB：返回QQ号
	 */
	@ApiModelProperty(value="详情参数")
	private String params;

	/**
	 * MD5签名
	 */
	@ApiModelProperty(value="MD5签名")
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

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFacePrice() {
		return facePrice;
	}

	public void setFacePrice(Integer facePrice) {
		this.facePrice = facePrice;
	}

	public Integer getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Integer actualPrice) {
		this.actualPrice = actualPrice;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public boolean isWaitAudit() {
		return waitAudit;
	}

	public void setWaitAudit(boolean waitAudit) {
		this.waitAudit = waitAudit;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}
