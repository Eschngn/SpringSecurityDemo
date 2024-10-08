package com.swc.springsecuritydemo.handler;

import com.swc.springsecuritydemo.utils.Response;
import com.swc.springsecuritydemo.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wilson
 * @Description: 登录成功访问收保护的资源，但是权限不够
 * @date 2024/10/8 14:13
 */
@Slf4j
@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.warn("登录成功访问收保护的资源，但是权限不够: ", accessDeniedException);
        ResultUtil.fail(response, Response.fail("该账号权限不够"));
    }
}
