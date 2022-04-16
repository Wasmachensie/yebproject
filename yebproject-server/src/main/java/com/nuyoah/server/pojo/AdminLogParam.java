package com.nuyoah.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/15/20:28
 * @Description:
 * 用户登录实体类
 * Admin数据太大了，登录要不了这么多数据，所以只传入一些必要的数据
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@ApiModel(value = "AdminLogin对象",description = "") //swagger注解
public class AdminLogParam {
    @ApiModelProperty(value = "用户名",required = true)
    private String username;
    @ApiModelProperty(value = "密码",required = true)//必填
    private String password;
}
