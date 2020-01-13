package com.example.mongo.service;

import com.example.mongo.dao.DeptDao;
import com.example.mongo.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    @Transactional
    public void insertSelective(Dept dept){
        deptDao.insertSelective(dept);
    }
}
