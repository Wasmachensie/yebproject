package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_admin_role
 */
@TableName(value ="t_admin_role")
@Data
public class AdminRole implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "adminId")
    private Integer adminId;

    /**
     * 权限id
     */
    @TableField(value = "rid")
    private Integer rid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}