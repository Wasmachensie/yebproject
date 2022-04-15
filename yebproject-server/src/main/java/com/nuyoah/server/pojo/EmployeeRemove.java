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
 * @TableName t_employee_remove
 */
@TableName(value ="t_employee_remove")
@Data
public class EmployeeRemove implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工id
     */
    @TableField(value = "eid")
    private Integer eid;

    /**
     * 调动后部门
     */
    @TableField(value = "afterDepId")
    private Integer afterDepId;

    /**
     * 调动后职位
     */
    @TableField(value = "afterJobId")
    private Integer afterJobId;

    /**
     * 调动日期
     */
    @TableField(value = "removeDate")
    private Date removeDate;

    /**
     * 调动原因
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