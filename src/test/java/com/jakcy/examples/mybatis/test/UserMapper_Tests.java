package com.jakcy.examples.mybatis.test;

import com.jakcy.examples.mybatis.ExamplesMybatis_Tests;
import com.jakcy.examples.mybatis.generator.mapper.UserMapper;
import com.jakcy.examples.mybatis.generator.pojo.User;
import com.jakcy.examples.mybatis.generator.pojo.UserExample;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserMapper_Tests extends ExamplesMybatis_Tests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void insert_test() {
        User u = new User();
        u.setLoginName("Tom");
        u.setId("abc");
        u.setUptUserName("Tom");

        userMapper.insert(u);

        User abc = userMapper.selectByPrimaryKey("abc");

        assertEquals("Tom", abc.getLoginName());
    }

    @Test
    public void countByExample_test() {
        insertUsers(20);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andSexEqualTo("男");
        long count = userMapper.countByExample(userExample);

        assertEquals(10, count);
    }

    private List<User> insertUsers(int count) {
        List<User> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            User u = new User();
            u.setLoginName("Tom" + i);
            u.setId("userId_000" + i);
            if (i % 2 == 0) {
                u.setSex("男");
            } else {
                u.setSex("女");
            }
            u.setUserName("Tom" + i);

            System.out.println(u);

            userMapper.insert(u);

            result.add(u);
        }

        return result;
    }
}
