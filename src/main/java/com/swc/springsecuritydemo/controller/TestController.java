package com.swc.springsecuritydemo.controller;

import com.swc.springsecuritydemo.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2024/10/8 16:49
 */
@RestController
@Slf4j
public class TestController {
    @PostMapping("/list")
    public Response testList(){
        log.info("用户查询成功...");
        return Response.success();
    }

    @PostMapping("/admin/list")
    public Response testAdminList(){
        log.info("管理员查询成功...");
        return Response.success();
    }

    @PostMapping("/admin/update")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response testAdminUpdate() {
        log.info("管理员更新成功...");
        return Response.success();
    }
}
