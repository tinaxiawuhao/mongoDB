package com.example.mongo;

import com.example.mongo.entity.Dept;
import com.example.mongo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    private DeptService DeptService;

    @Transactional
    public void test1() {
        System.out.println("执行test1");
        System.out.println("插入数据1");
        DeptService.insertSelective(Dept.builder().did(2).dname("测试").dcode("wew").build());
        try {
            test2();
        } catch (Exception e) {
            System.out.println("不断程序，用来输出日志~");
        }
        //制造异常
        /*System.out.println("制造异常1");
        int a=1/0;*/


    }

    @Transactional
    public void test2() {
        System.out.println("执行test2");
        DeptService.insertSelective(Dept.builder().did(3).dname("测试").dcode("wew").build());
        //制造异常
        System.out.println(1 / 0);

    }

}
