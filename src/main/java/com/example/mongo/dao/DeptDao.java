package com.example.mongo.dao;

import com.example.mongo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {
    void insertSelective(Dept dept);
}
