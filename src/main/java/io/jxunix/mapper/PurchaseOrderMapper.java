package io.jxunix.mapper;

import io.jxunix.domain.PurchaseOrder;
import io.jxunix.domain.PurchaseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int countByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int deleteByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int insert(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int insertSelective(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    List<PurchaseOrder> selectByExample(PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    PurchaseOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int updateByExampleSelective(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int updateByExample(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int updateByPrimaryKeySelective(PurchaseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    int updateByPrimaryKey(PurchaseOrder record);
}