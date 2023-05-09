package com.example.sys.service;

import com.example.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  Service class
 * </p>
 *
 * @author wangzhenyuan
 * @since 2023-04-20
 */
public interface IUserService extends IService<User> {

    Map<String, Object> login(User user);

    Map<String, Object> getUserInfo(String token);

    void logout(String token);
}
