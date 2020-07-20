package com.baizhi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ author bannerblade
 * @ date 2020/7/18
 */
@Data
@Accessors(chain = true)
public class Emp implements Serializable {
    private String id;
    private String name;
    private String path;
    private String salary;
    private String age;
}
