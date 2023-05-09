package com.example.sys.mapper;

import com.example.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 *
 * @author wangzhenyuan
 * @since 2023-04-20
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getRoleNamesByUserId(Integer userId);
}
