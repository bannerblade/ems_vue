package com.baizhi.dao;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ author bannerblade
 * @ date 2020/7/18
 */
@Mapper // 用来创建DAO对象
public interface EmpDAO {
    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    void update(Emp emp);
    
    Emp findOne(String id);
}
