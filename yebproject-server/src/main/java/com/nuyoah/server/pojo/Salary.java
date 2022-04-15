package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_salary
 */
@TableName(value ="t_salary")
@Data
public class Salary implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 基本工资
     */
    @TableField(value = "basicSalary")
    private Integer basicSalary;

    /**
     * 奖金
     */
    @TableField(value = "bonus")
    private Integer bonus;

    /**
     * 午餐补助
     */
    @TableField(value = "lunchSalary")
    private Integer lunchSalary;

    /**
     * 交通补助
     */
    @TableField(value = "trafficSalary")
    private Integer trafficSalary;

    /**
     * 应发工资
     */
    @TableField(value = "allSalary")
    private Integer allSalary;

    /**
     * 养老金基数
     */
    @TableField(value = "pensionBase")
    private Integer pensionBase;

    /**
     * 养老金比率
     */
    @TableField(value = "pensionPer")
    private Double pensionPer;

    /**
     * 启用时间
     */
    @TableField(value = "createDate")
    private Date createDate;

    /**
     * 医疗基数
     */
    @TableField(value = "medicalBase")
    private Integer medicalBase;

    /**
     * 医疗保险比率
     */
    @TableField(value = "medicalPer")
    private Double medicalPer;

    /**
     * 公积金基数
     */
    @TableField(value = "accumulationFundBase")
    private Integer accumulationFundBase;

    /**
     * 公积金比率
     */
    @TableField(value = "accumulationFundPer")
    private Double accumulationFundPer;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}