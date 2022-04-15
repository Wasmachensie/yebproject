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
 * @TableName t_sys_msg_content
 */
@TableName(value ="t_sys_msg_content")
@Data
public class SysMsgContent implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 内容
     */
    @TableField(value = "message")
    private String message;

    /**
     * 创建时间
     */
    @TableField(value = "createDate")
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}