package com.quge.myweb.service.impl;

import com.quge.myweb.entity.User;
import com.quge.myweb.mapper.UserMapper;
import com.quge.myweb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findMyMessage(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
