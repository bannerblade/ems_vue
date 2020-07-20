package com.baizhi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @ author bannerblade
 * @ date 2020/7/17
 */
@Data
@Accessors(chain = true)
public class User {
    private String id;//不用id类型的原因，string类型的api相当多
    private String username;
    private String realname;
    private String password;
    private String sex;
    private String status;
    private Date registerTime;
}
