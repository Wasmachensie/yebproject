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
 * @TableName t_salary_adjust
 */
@TableName(value ="t_salary_adjust")
@Data
public class SalaryAdjust implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工ID
     */
    @TableField(value = "eid")
    private Integer eid;

    /**
     * 调薪日期
     */
    @TableField(value = "asDate")
    private Date asDate;

    /**
     * 调前薪资
     */
    @TableField(value = "beforeSalary")
    private Integer beforeSalary;

    /**
     * 调后薪资
     */
    @TableField(value = "afterSalary")
    private Integer afterSalary;

    /**
     * 调薪原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}