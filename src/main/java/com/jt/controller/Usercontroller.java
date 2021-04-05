package com.jt.controller;

import com.jt.dao.UserDao;
import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class Usercontroller {

    @Autowired
    private UserDao userDao;
    @RequestMapping("first")
    @ResponseBody
    public String first(){
        return "我是你爸爸";
    }

}
