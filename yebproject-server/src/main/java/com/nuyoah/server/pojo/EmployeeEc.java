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
 * @TableName t_employee_ec
 */
@TableName(value ="t_employee_ec")
@Data
public class EmployeeEc implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    @TableField(value = "eid")
    private Integer eid;

    /**
     * 奖罚日期
     */
    @TableField(value = "ecDate")
    private Date ecDate;

    /**
     * 奖罚原因
     */
    @TableField(value = "ecReason")
    private String ecReason;

    /**
     * 奖罚分
     */
    @TableField(value = "ecPoint")
    private Integer ecPoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    @TableField(value = "ecType")
    private Integer ecType;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}