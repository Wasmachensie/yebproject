package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_menu
 */
@TableName(value ="t_menu")
@Data
public class Menu implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * url
     */
    @TableField(value = "url")
    private String url;

    /**
     * path
     */
    @TableField(value = "path")
    private String path;

    /**
     * 组件
     */
    @TableField(value = "component")
    private String component;

    /**
     * 菜单名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 图标
     */
    @TableField(value = "iconCls")
    private String iconCls;

    /**
     * 是否保持激活
     */
    @TableField(value = "keepAlive")
    private Integer keepAlive;

    /**
     * 是否要求权限
     */
    @TableField(value = "requireAuth")
    private Integer requireAuth;

    /**
     * 父id
     */
    @TableField(value = "parentId")
    private Integer parentId;

    /**
     * 是否启用
     */
    @TableField(value = "enabled")
    private Integer enabled;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}