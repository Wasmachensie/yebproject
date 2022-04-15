package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_sys_msg
 */
@TableName(value ="t_sys_msg")
@Data
public class SysMsg implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 消息id
     */
    @TableField(value = "mid")
    private Integer mid;

    /**
     * 0表示群发消息
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 这条消息是给谁的
     */
    @TableField(value = "adminid")
    private Integer adminid;

    /**
     * 0 未读 1 已读
     */
    @TableField(value = "state")
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}