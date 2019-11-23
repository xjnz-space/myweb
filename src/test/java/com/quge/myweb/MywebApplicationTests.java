package com.quge.myweb;

import com.quge.myweb.entity.User;
import com.quge.myweb.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MywebApplication.class)
public class MywebApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

}
