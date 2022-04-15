package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_admin
 */
@TableName(value ="t_admin")
@Data
public class Admin implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 住宅电话
     */
    @TableField(value = "telephone")
    private String telephone;

    /**
     * 联系地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 是否启用
     */
    @TableField(value = "enabled")
    private Integer enabled;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 用户头像
     */
    @TableField(value = "userFace")
    private String userFace;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}