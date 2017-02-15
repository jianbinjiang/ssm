package com.hk.integralMall.utils;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 签名
 * @author jiangjianbin
 * 创建日期:2016年10月20日 下午1:43:56
 */
public class SignEncryption {

	private static String toHexValue(byte[] messageDigest) {
		if (messageDigest == null)
			return "";
		StringBuilder hexValue = new StringBuilder();
		for (byte aMessageDigest : messageDigest) {
			int val = 0xFF & aMessageDigest;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	
	/** 
	* @Title: sign 
	* @Description: 参数签名加密
	* @param params
	* @return
	* @throws Exception  
	*/
	public static String sign(Map<String,Object> params) throws Exception{
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		keys.stream().map(k ->params.get(k).toString()).collect(Collectors.joining());
		String vals = keys.stream().reduce("",(acc,ele)->
			acc.concat(params.get(ele).toString())
		);
		String sign = toHexValue(encryptMD5(vals.getBytes(Charset.forName("utf-8"))));
		return sign;
	}
	
	
	private static byte[] encryptMD5(byte[] data)throws Exception{
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(data);
		return md5.digest();
	}
	
	
	
	/**
	 * 通用的url生成方法
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	public static String buildUrlWithSign(Map<String,Object> params) throws Exception{
		//签名参数
		String coverURL = "?";
			String sign = sign(params);
			params.remove("appSecret");
			params.put("sign", sign);
			
			coverURL += params.entrySet().stream().map(ele->{
				String str = null;
				try {
					str = ele.getKey().concat("=").concat(URLEncoder.encode(ele.getValue().toString(),"utf-8")+"&");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return str;
			}).collect(Collectors.joining());
		return coverURL;
	}
}
