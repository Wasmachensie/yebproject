package com.nuyoah.server.service;

import com.nuyoah.server.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuyoah.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
* @author 12240
* @description 针对表【t_admin】的数据库操作Service
* @createDate 2022-04-15 19:37:22
*/
public interface AdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);
}
