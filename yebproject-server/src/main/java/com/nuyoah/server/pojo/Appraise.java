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
 * @TableName t_appraise
 */
@TableName(value ="t_appraise")
@Data
public class Appraise implements Serializable {
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
     * 考评日期
     */
    @TableField(value = "appDate")
    private Date appDate;

    /**
     * 考评结果
     */
    @TableField(value = "appResult")
    private String appResult;

    /**
     * 考评内容
     */
    @TableField(value = "appContent")
    private String appContent;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}