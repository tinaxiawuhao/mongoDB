package com.example.mongo.controller;

import com.example.mongo.dao.MongoDao;
import com.example.mongo.entity.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MongoController {
 
    @Autowired
    private MongoDao mtdao;
 
    @GetMapping(value="/save")
    public void saveTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }
 
    @GetMapping(value="/find")
    public MongoTest findTestByName(){
        MongoTest mgtest= mtdao.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }
 
    @GetMapping(value="/update")
    public void updateTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }
 
    @GetMapping(value="/delete")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }
}