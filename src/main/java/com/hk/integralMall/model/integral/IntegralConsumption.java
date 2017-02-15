package com.hk.integralMall.model.integral;

import com.wordnik.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.ApiModel;

/** 
* @ClassName: IntegralConsumption 
* @author bushuai
* @Description: 积分消费表
* @date 2016年10月18日 下午2:27:05 
*/
@ApiModel("积分消耗")
public class IntegralConsumption {
    /**
     * 自增主键
     */
	@ApiModelProperty("自增主键")
    private Integer id;

    /**
     * 用户ID
     */
	@ApiModelProperty("用户ID")
    private String userid;

    /**
     * 预消费ID
     */
	@ApiModelProperty("预消费ID")
    private Integer presumpid;

    /**
     * 兑吧订单ID
     */
	@ApiModelProperty("兑吧订单ID")
    private String orderid;

    /**
     * 预消费说明
     * 
     */
	@ApiModelProperty("说明")
    private String instructions;

    /**
     * 预消费分值
     */
	@ApiModelProperty("分值")
    private Integer score;

    /**
     * 是否有效
     */
	@ApiModelProperty("是否有效")
    private String iseffective;

    /**
     * 创建时间
     */
	@ApiModelProperty("创建时间")
    private String ctime;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取预消费ID
     *
     * @return preSumpId - 预消费ID
     */
    public Integer getPresumpid() {
        return presumpid;
    }

    /**
     * 设置预消费ID
     *
     * @param presumpid 预消费ID
     */
    public void setPresumpid(Integer presumpid) {
        this.presumpid = presumpid;
    }

    /**
     * 获取兑吧订单ID
     *
     * @return orderId - 兑吧订单ID
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置兑吧订单ID
     *
     * @param orderid 兑吧订单ID
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取预消费说明
     *
     * @return instructions - 预消费说明
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * 设置预消费说明
     *
     * @param instructions 预消费说明
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions == null ? null : instructions.trim();
    }

    /**
     * 获取预消费分值
     *
     * @return score - 预消费分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置预消费分值
     *
     * @param score 预消费分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取是否有效
     *
     * @return isEffective - 是否有效
     */
    public String getIseffective() {
        return iseffective;
    }

    /**
     * 设置是否有效
     *
     * @param iseffective 是否有效
     */
    public void setIseffective(String iseffective) {
        this.iseffective = iseffective == null ? null : iseffective.trim();
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public String getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}