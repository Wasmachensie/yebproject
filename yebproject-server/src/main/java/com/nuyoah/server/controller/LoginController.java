package com.nuyoah.server.controller;

import com.nuyoah.server.pojo.Admin;
import com.nuyoah.server.pojo.AdminLogParam;
import com.nuyoah.server.pojo.RespBean;
import com.nuyoah.server.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/15/20:33
 * @Description:
 */
@Api(tags = "LoginController")
@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(AdminLogParam adminLogParam, HttpServletRequest request) {
        return adminService.login(adminLogParam.getUsername(),
                adminLogParam.getPassword(), request);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal) {
        if (principal == null) {
            return null;
        }
        String username = principal.getName();
        // 根据用户名查询用户信息(获取一个完整的用户对象)
        Admin admin = adminService.getAdminByUsername(username);
        //不可以返回密码
        admin.setPassword(null);
        return admin;
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout() {
        return RespBean.success("退出成功！");
    }
}

