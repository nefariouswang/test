package com.hz.springsecurity02.controller;

import com.hz.springsecurity02.service.UserService;
import com.hz.springsecurity02.utils.MassageJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public MassageJson<String> login( String uname, String upwd){
        //调用业务层
        return userService.login(uname,upwd);
    }
    @GetMapping("/menu")
    public MassageJson<String> menu(){
        System.out.println("进来了menu");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }
    @GetMapping("/info")
    public MassageJson<String> info(){
        System.out.println("进来了info");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }
    @GetMapping("/list")
    public MassageJson<String> list(){
        System.out.println("进来了list");
        System.out.println("1111111111111");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }











}
