package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ author bannerblade
 * @ date 2020/7/17
 */
@Mapper // 用来创建DAO对象
public interface UserDAO {
    void save(User user);

    User findByUserName(String username);

}
