package io.jxunix.domain;

import java.util.Date;

public class PurchaseOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.price
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.id
     *
     * @return the value of purchase_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.id
     *
     * @param id the value for purchase_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.goods_id
     *
     * @return the value of purchase_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.goods_id
     *
     * @param goodsId the value for purchase_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.num
     *
     * @return the value of purchase_order.num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.num
     *
     * @param num the value for purchase_order.num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.price
     *
     * @return the value of purchase_order.price
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.price
     *
     * @param price the value for purchase_order.price
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.supplier_id
     *
     * @return the value of purchase_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.supplier_id
     *
     * @param supplierId the value for purchase_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.user_id
     *
     * @return the value of purchase_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.user_id
     *
     * @param userId the value for purchase_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_order.create_time
     *
     * @return the value of purchase_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_order.create_time
     *
     * @param createTime the value for purchase_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}