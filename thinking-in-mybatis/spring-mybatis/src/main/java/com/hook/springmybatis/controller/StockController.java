package com.hook.springmybatis.controller;

import com.hook.springmybatis.mapper.StockMapper;
import com.hook.springmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/7 09:50
 *
 * @Version 1.0
 **/


@RestController
public class StockController {


    @Autowired
    StockMapper stockMapper;

    @GetMapping(value = "/stock")
    public String getStock() {
        return stockMapper.findAll().get(0).toString();
    }


    @Autowired
    UserMapper userMapper;

    @GetMapping(value = "addUser")
    public String addUser() {
        userMapper.addUser(1L, "jack", "qwer123");
        return "success";
    }
}
