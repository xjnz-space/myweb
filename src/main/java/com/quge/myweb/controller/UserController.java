package com.quge.myweb.controller;

import com.quge.myweb.entity.User;
import com.quge.myweb.properties.StudentProperties;
import com.quge.myweb.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private StudentProperties studentProperties;
    @RequestMapping("/getProperties")
    public String get(){
        return "cxk"+studentProperties.getName()+studentProperties.getAge();
    }
    @Resource
    private UserService userService;
    @RequestMapping("/selectMyMessage/{userId}")
    public User selectMyMessage(@PathVariable("userId")Integer userId){
        User user = userService.findMyMessage(userId);
        return user;
    }
}
