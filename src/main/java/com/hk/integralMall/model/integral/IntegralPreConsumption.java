package com.hk.integralMall.model.integral;


/** 
* @ClassName: IntegralPreConsumption 
* @author bushuai
* @Description: 用户预消费积分表
* @date 2016年10月18日 下午2:26:44 
*/
public class IntegralPreConsumption {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 兑吧订单ID
     */
    private String orderid;

    /**
     * 预消费说明
     */
    private String instructions;

    /**
     * 预消费分值
     */
    private Integer score;

    /**
     * 是否已结单(0未结单，1已结单)
     */
    private Boolean isstatement;

    /**
     * 兑吧处理状态(0失败1成功2未处理)
     */
    private int resultstatus;

    /**
     * 是否有效(Y有效,N无效)
     */
    private String iseffective;

    /**
     * 创建时间
     */
    private String ctime;

    /**
     * 更新时间
     */
    private String utime;

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
     * 获取是否已结单(0未结单，1已结单)
     *
     * @return isStatement - 是否已结单(0未结单，1已结单)
     */
    public Boolean getIsstatement() {
        return isstatement;
    }

    /**
     * 设置是否已结单(0未结单，1已结单)
     *
     * @param isstatement 是否已结单(0未结单，1已结单)
     */
    public void setIsstatement(Boolean isstatement) {
        this.isstatement = isstatement;
    }

    /**
     * 获取兑吧处理状态(0失败1成功)
     *
     * @return resultStatus - 兑吧处理状态(0失败1成功)
     */
    public int getResultstatus() {
        return resultstatus;
    }

    /**
     * 设置兑吧处理状态(0失败1成功)
     *
     * @param resultstatus 兑吧处理状态(0失败1成功)
     */
    public void setResultstatus(int resultstatus) {
        this.resultstatus = resultstatus;
    }

    /**
     * 获取是否有效(Y有效,N无效)
     *
     * @return isEffective - 是否有效(Y有效,N无效)
     */
    public String getIseffective() {
        return iseffective;
    }

    /**
     * 设置是否有效(Y有效,N无效)
     *
     * @param iseffective 是否有效(Y有效,N无效)
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

    /**
     * 获取更新时间
     *
     * @return utime - 更新时间
     */
    public String getUtime() {
        return utime;
    }

    /**
     * 设置更新时间
     *
     * @param utime 更新时间
     */
    public void setUtime(String utime) {
        this.utime = utime;
    }
}