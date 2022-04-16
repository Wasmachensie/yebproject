package com.nuyoah.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/15/20:20
 * @Description:
 * 公共返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private Integer status;//状态码
    private String msg;//提示消息
    private Object obj;//返回对象

    /**
     * 成功返回
     * @param msg
     * @return
     */
    public static RespBean success(String msg) {
        return new RespBean(200, msg, null);
    }

    /**
     * 成功返回,并且带有返回对象
     * @param msg
     * @param obj
     * @return
     */
    public static RespBean success(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    /**
     * 失败返回
     * @param msg
     * @return
     */
    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    /**
     * 失败返回,并且带有返回对象
     * @param msg
     * @param data
     * @return
     */
    public static RespBean error(String msg, Object data) {
        return new RespBean(500, msg, data);
    }
}

