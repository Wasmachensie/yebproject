package com.nuyoah.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nuyoah.server.pojo.RespBean;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/16/9:52
 * @Description:
 * 当未登录或者token失效访问接口时，返回自定义的错误信息
 */
@Component
public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = response.getWriter();
        RespBean respBean = RespBean.error("未登录或token已过期");
        respBean.setStatus(401);
        out.write(new ObjectMapper().writeValueAsString(respBean));
        out.flush();// 刷新
        out.close();// 关闭

    }
}
