package com.swc.springsecuritydemo.service.impl;

import com.swc.springsecuritydemo.entity.User;
import com.swc.springsecuritydemo.mapper.UserMapper;
import com.swc.springsecuritydemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author swc
 * @since 2024-10-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
