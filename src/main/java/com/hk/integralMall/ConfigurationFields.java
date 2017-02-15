package com.hk.integralMall;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.hk.integralMall.utils.CommonUtils;

/**
 * @author Buke
 * 读取配置字段
 */
@Configuration
public class ConfigurationFields {
	
	public static final byte OK_STATUS = 1;
	
	/**
	 * 兑吧接口appKey，应用的唯一标识
	 */
	@Value("#{pValue['sys.yike2duiba.appKey']}")
	private String appDuiBaKey;
	
	public static String APP_DuiBa_KEY;
	
	
	
	/** 
	* @Fields app_YK_Key : 积分商城签名
	*/
	@Value("#{pValue['sys.yikeIntegralMall.appKey']}")
	private String app_YK_Key;
	
	public static String APP_YK_KEY;
	
	
	/**
	 * 密钥
	 */
	@Value("#{pValue['sys.yike2duiba.appSecret']}")
	private String appSecret;
	
	public static String APPSECRET;
	
	
	/**
	 * 请求duiba地址
	 */
	@Value("#{pValue['sys.yike2duiba.autoLoginUrl']}")
	private String autoLoginUrl;
	
	public static String DUIBA_AutoLoginUrl;
	
	
	/**
	 * 签到按钮文案
	 */
	@Value("#{pValue['sys.duiba2yike.btnText']}")
	private String btnText;
	
	public static String BET_TEXT;
	
	
	/**
	 * 医客API URL
	 */
	@Value("#{pValue['sys.yike.yikeAPI']}")
	private String yikeApi;
	
	public static String YKAPI;
	
	/**
	 * 医客API cookie
	 */
	@Value("#{pValue['sys.yike.yikeAPI.cookie']}")
	private String yikeAPI_Cookie;
	
	public static String YKAPI_Cookie;
	
	
	@PostConstruct
	public void init() {
		APP_DuiBa_KEY = this.appDuiBaKey;
		APP_YK_KEY = this.app_YK_Key;
		APPSECRET = this.appSecret;
		DUIBA_AutoLoginUrl = this.autoLoginUrl;
		BET_TEXT = this.btnText;
		YKAPI = this.yikeApi;
		YKAPI_Cookie = String.format(this.yikeAPI_Cookie, CommonUtils.GenerateUUID());
	}
}
