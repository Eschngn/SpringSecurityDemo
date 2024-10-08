package com.swc.springsecuritydemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.swc.springsecuritydemo.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author swc
 * @since 2024-10-08
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    default List<UserRole> selectByUsername(String username) {
        LambdaQueryWrapper<UserRole> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserRole::getUsername, username);

        return selectList(wrapper);
    }

}
