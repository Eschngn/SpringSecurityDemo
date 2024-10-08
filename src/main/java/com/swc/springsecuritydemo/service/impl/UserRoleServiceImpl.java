package com.swc.springsecuritydemo.service.impl;

import com.swc.springsecuritydemo.entity.UserRole;
import com.swc.springsecuritydemo.mapper.UserRoleMapper;
import com.swc.springsecuritydemo.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author swc
 * @since 2024-10-08
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
