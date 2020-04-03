package com.znmq.point.mybatis.service;

import com.znmq.point.mybatis.entity.UserPoint;
import com.znmq.point.mybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sofiya
 * @Description: TODO
 * @Date 2020/4/24:06 下午
 * @Email: wangjie@znjs.com
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public UserPoint Sel(int id){

        return userMapper.Sel(id);

    }
}
