package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * @ author bannerblade
 * @ date 2020/7/17
 */
public interface UserService {
    //用户注册
    void register(User user);

    //用户登录
    User login(User user);
}
