package com.hk.integralMall.vo;

import com.hk.integralMall.model.integral.IntegralConsumption;
import com.wordnik.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.ApiModel;

/** 
* @ClassName: IntegralConsumptionVO 
* @author bushuai
* @Description: 积分记录VO
* @date 2016年10月25日 上午10:14:30 
*/
@ApiModel("积分记录数据响应VO")
public class IntegralConsumptionVO extends IntegralConsumption{
	
	/** 
	* @Fields tag :积分记录类型(1获取 2消耗) 
	*/
	@ApiModelProperty("积分记录类型(1获取 2消耗) ")
	private int tag;

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
	
	
}
