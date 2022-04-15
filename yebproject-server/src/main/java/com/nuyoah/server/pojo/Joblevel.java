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
 * @TableName t_joblevel
 */
@TableName(value ="t_joblevel")
@Data
public class Joblevel implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 职称名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 职称等级
     */
    @TableField(value = "titleLevel")
    private Object titleLevel;

    /**
     * 创建时间
     */
    @TableField(value = "createDate")
    private Date createDate;

    /**
     * 是否启用
     */
    @TableField(value = "enabled")
    private Integer enabled;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}