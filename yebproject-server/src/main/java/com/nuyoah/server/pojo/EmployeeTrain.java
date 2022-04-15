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
 * @TableName t_employee_train
 */
@TableName(value ="t_employee_train")
@Data
public class EmployeeTrain implements Serializable {
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
     * 培训日期
     */
    @TableField(value = "trainDate")
    private Date trainDate;

    /**
     * 培训内容
     */
    @TableField(value = "trainContent")
    private String trainContent;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}