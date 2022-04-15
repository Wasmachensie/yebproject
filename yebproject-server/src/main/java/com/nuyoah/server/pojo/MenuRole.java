package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_menu_role
 */
@TableName(value ="t_menu_role")
@Data
public class MenuRole implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单id
     */
    @TableField(value = "mid")
    private Integer mid;

    /**
     * 权限id
     */
    @TableField(value = "rid")
    private Integer rid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}