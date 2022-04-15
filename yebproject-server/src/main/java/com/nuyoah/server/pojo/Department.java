package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_department
 */
@TableName(value ="t_department")
@Data
public class Department implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 部门名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 父id
     */
    @TableField(value = "parentId")
    private Integer parentId;

    /**
     * 路径
     */
    @TableField(value = "depPath")
    private String depPath;

    /**
     * 是否启用
     */
    @TableField(value = "enabled")
    private Integer enabled;

    /**
     * 是否上级
     */
    @TableField(value = "isParent")
    private Integer isParent;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}