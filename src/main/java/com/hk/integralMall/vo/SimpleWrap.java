package com.hk.integralMall.vo;

import java.io.Serializable;

/** 
* @ClassName: SimpleWrap 
* @author bushuai
* @param <T>
* @Description: 数据响应实体
* @date 2016年10月19日 上午10:26:31 
*/
public class SimpleWrap implements Serializable{
	/** 
	* @Fields serialVersionUID : 
	*/
	private static final long serialVersionUID = -6719527233332736614L;

	/** 
	* @Fields msgCode : 消息码
	*/
	private String msgCode = "200";
	
	/** 
	* @Fields msgContext : 消息内容
	*/
	private String msgContext = "invoke Success~";
	
	/** 
	* @Fields rows : 响应数据
	*/
	private Object rowData;

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsgContext() {
		return msgContext;
	}

	public void setMsgContext(String msgContext) {
		this.msgContext = msgContext;
	}

	public Object getRowData() {
		return rowData;
	}

	public void setRowData(Object rowData) {
		this.rowData = rowData;
	}

	
	
}
