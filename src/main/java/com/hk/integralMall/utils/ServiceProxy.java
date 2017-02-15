package com.hk.integralMall.utils;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.hk.integralMall.ConfigurationFields;

/** 
* @ClassName: ServiceProxy 
* @author bushuai
* @Description: 请求包装类
* @date 2016年3月31日 下午4:43:07 
*/
@Component
public class ServiceProxy{
	@Autowired
	private RestTemplate restTemplate;
	
	/** 
	* @Title: ProcessRequest 
	* @Description: 请求方法包装
	* @param urlFullPath
	* @param JsonConvert
	* @return  
	*/
	public String ProcessRequest(String urlFullPath,String JsonConvert){
		HttpHeaders headers = new HttpHeaders();
		
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
		headers.add(HttpHeaders.COOKIE, ConfigurationFields.YKAPI_Cookie);
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		headers.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
		
		HttpEntity<String> entity = new HttpEntity<String>(JsonConvert, headers);
		
		ResponseEntity<String> result = restTemplate.exchange(urlFullPath,HttpMethod.POST,entity,String.class);
		
		return result.getBody(); 
	}
}
