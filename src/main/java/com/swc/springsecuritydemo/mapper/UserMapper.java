package com.swc.springsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.swc.springsecuritydemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author swc
 * @since 2024-10-08
 */
public interface UserMapper extends BaseMapper<User> {
    default User findByUsername(String username){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, username);
        return selectOne(wrapper);
    }
}
