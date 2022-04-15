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
 * @TableName t_mail_log
 */
@TableName(value ="t_mail_log")
@Data
public class MailLog implements Serializable {
    /**
     * 消息id
     */
    @TableField(value = "msgId")
    private String msgId;

    /**
     * 接收员工id
     */
    @TableField(value = "eid")
    private Integer eid;

    /**
     * 状态（0:消息投递中 1:投递成功 2:投递失败）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 路由键
     */
    @TableField(value = "routeKey")
    private String routeKey;

    /**
     * 交换机
     */
    @TableField(value = "exchange")
    private String exchange;

    /**
     * 重试次数
     */
    @TableField(value = "count")
    private Integer count;

    /**
     * 重试时间
     */
    @TableField(value = "tryTime")
    private Date tryTime;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}