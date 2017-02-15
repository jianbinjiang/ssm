package com.hk.integralMall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 
 * @author jiangjianbin
 * 创建日期:2016年11月1日 下午2:36:04
 */
@ApiModel("用户注册参数VO")
public class RegisteVo {
	
	/**
	 * 电话号码
	 */
	@ApiModelProperty(value="电话号码",required=true)
	private String mobilePhone;
	
	/**
	 * 密码
	 */
	@ApiModelProperty(value="密码",required=true)
	private String password;
	/**
	 * 手机验证码
	 */
	@ApiModelProperty(value="手机验证码",required=true)
	private String captcha;
	/**
	 * 邀请人id
	 */
	@ApiModelProperty(value="邀请人id",required=true)
	private String userId;
	/**
	 *分享邀请码
	 */
	@ApiModelProperty(value="分享邀请码",required=true)
	private String inviteCode;
	
	
	/**
	 * 浏览器UA
	 */
	@ApiModelProperty(value="浏览器UA",required=true)
	private String inviteUA;
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getInviteUA() {
		return inviteUA;
	}
	public void setInviteUA(String inviteUA) {
		this.inviteUA = inviteUA;
	}
	
}
