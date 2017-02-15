package com.hk.YkIntegralMall;

import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hk.integralMall.ConfigurationFields;
import com.hk.integralMall.utils.CommonUtils;
import com.hk.integralMall.utils.ServiceProxy;
import com.hk.integralMall.utils.SignEncryption;


/**
 * @ClassName: TestUserService
 * @author Administrator
 * @Description:
 * @date 2016年1月20日 下午7:37:39
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration(value = "src/main/webapp")
//@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" })
public class TestUserService {
	@Autowired
	private ServiceProxy serviceProxy;
	
	@Test
	public void testUserLogin() {
		System.out.println(UUID.fromString(UUID.randomUUID()+""));
	}
	
	@Test
	public void testMD5(){
		/*
		 * http://www.duiba.com.cn/autoLogin/autologin?uid=test001&credits=100&
		 * appKey=jlg88loSQobWDMmGrPLqtmr&sign=fbce303d7ba7ca7b0fe14d576b494769&timestamp=1418625055000
		 */
		String appSecret="2qsd69Q3BRVYfZGGRm8siciBmjLR";
		String appKey="3yukjVoVZcWGcWY2hF3gPAzWhi7H";
		String baseUrl = "http://www.duiba.com.cn/autoLogin/autologin";
		Map<String, String> params=new HashMap<String, String>();
		params.put("appKey", appKey);
		params.put("uid", "not_login");
		params.put("credits", "100");
		params.put("appSecret", appSecret);
		params.put("timestamp", new Date().getTime()+"");
		//params.put("description", "兑吧");
//		String sign=SignEncryption.sign(params);
//		String url =SignEncryption.buildUrlWithSign(baseUrl, params);
//		System.out.println(sign);
		/*params.put("sign", sign);
		
		System.out.println(SignEncryption.signVerify(appSecret, params));
		System.out.println(new Date().getTime());*/
	}
	
	
	@Test
	public void getTimeStamp() throws JsonProcessingException{
		Calendar calendar = Calendar.getInstance();  
        calendar.clear();  
        calendar.set(Calendar.YEAR, 2017);  
        calendar.roll(Calendar.DAY_OF_YEAR, -1);  
		System.out.println(CommonUtils.DateFormat("yyyy-MM-dd", calendar.getTime()));
		
		String inParam = CommonUtils.objectMapper.writeValueAsString(new User().getInstance("18850705892","1231414",false));
		
		String sss = serviceProxy.ProcessRequest(ConfigurationFields.YKAPI.concat("/userLogin/userLogin"),inParam);
		System.out.println(sss);
		String result = serviceProxy.ProcessRequest(ConfigurationFields.YKAPI.concat("/doctorUser/getDoctorUserDetail"), "");
		System.out.println(result);
	}
	
	class User{
		private String loginName;
		private String password;
		private boolean isSendMsg;
		public User getInstance(String loginName,String password,boolean isSendMsg){
			User u = new User();
			u.setLoginName(loginName);
			u.setPassword(password);
			u.setSendMsg(isSendMsg);
			return u;
		}
		public String getLoginName() {
			return loginName;
		}
		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean isSendMsg() {
			return isSendMsg;
		}
		public void setSendMsg(boolean isSendMsg) {
			this.isSendMsg = isSendMsg;
		}
		
	}
	
	
	@Test
	public void Lamda(){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("asdfasfd", "asfd");
		StringBuilder sb = new StringBuilder();
		params.entrySet().stream().forEach(ele->{
				
		try {
				sb.append(ele.getKey().concat("=")
						.concat(URLEncoder.encode(ele.getValue().toString(),"utf-8")) + "&")
				;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
