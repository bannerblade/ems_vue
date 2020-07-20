package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

/**
 * @ author bannerblade
 * @ date 2020/7/18
 */
public interface EmpService {
    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp findOne(String id);

    void update(Emp emp);

}
