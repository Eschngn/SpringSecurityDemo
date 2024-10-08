package com.swc.springsecuritydemo.utils;

import com.swc.springsecuritydemo.entity.UserRole;
import com.swc.springsecuritydemo.mapper.UserMapper;
import com.swc.springsecuritydemo.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2024/10/8 13:08
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //从数据库查询
        com.swc.springsecuritydemo.entity.User user = userMapper.findByUsername(username);
        // 判断用户是否存在
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        List<UserRole> userRoles = userRoleMapper.selectByUsername(username);
        String[] roleArr =null;

        //转数组
        if(!CollectionUtils.isEmpty(userRoles)){
            List<String> roles = userRoles.stream().map(p -> p.getRole()).collect(Collectors.toList());
            roleArr = roles.toArray(new String[roles.size()]);
        }

        // authorities 用于指定角色
        return User.withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(roleArr)
                .build();
    }
}
