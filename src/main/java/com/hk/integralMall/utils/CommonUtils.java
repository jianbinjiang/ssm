package com.hk.integralMall.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ClassName: CommonUtils
 * @author jiangjianbin
 * @Description: 常用工具集合
 * @date 2016年10月15日 下午1:41:09
 */
public class CommonUtils {
	public final static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * 当前时间格式化
	 * 
	 * @param parseFormat
	 * @return
	 */
	public static String DateFormat(String parseFormat, Date date) {
		SimpleDateFormat simpleFormat = new SimpleDateFormat(parseFormat);
		return simpleFormat.format(date);
	}

	/**
	 * @return 生成唯一标识符 CommonUtils 2015-6-19下午2:26:53
	 */
	public static String GenerateUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	
	/**
	 * TODO 等待处理
	 * @return
	 */
	public static String getFailureTime(){
		//插入积分失效时间
		Calendar now = Calendar.getInstance();  
		Calendar calendar = Calendar.getInstance();  
	    calendar.clear();  
	    calendar.set(Calendar.YEAR, now.get(Calendar.YEAR) + 1);  
	    calendar.roll(Calendar.DAY_OF_YEAR, -1);
	    return CommonUtils.DateFormat("yyyy-MM-dd", calendar.getTime());
	}
	
	
	/**
	 * @Title: objectToMap
	 * @Description: 对象转换为MAP
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> objectToMap(Object obj) throws Exception {
		if (obj == null)
			return null;

		Map<String, Object> map = new ConcurrentHashMap<String, Object>();

		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor property : propertyDescriptors) {
			String key = property.getName();
			if (key.compareToIgnoreCase("class") == 0) {
				continue;
			}
			Method getter = property.getReadMethod();
			Object value = getter != null ? getter.invoke(obj) : null;
			map.put(key, value);
		}
		return map;
	}
}
