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
 * @TableName t_oplog
 */
@TableName(value ="t_oplog")
@Data
public class Oplog implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 添加日期
     */
    @TableField(value = "addDate")
    private Date addDate;

    /**
     * 操作内容
     */
    @TableField(value = "operate")
    private String operate;

    /**
     * 操作员ID
     */
    @TableField(value = "adminid")
    private Integer adminid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}