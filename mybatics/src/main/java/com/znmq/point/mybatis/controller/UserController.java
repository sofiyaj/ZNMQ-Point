package com.znmq.point.mybatis.controller;

import com.znmq.point.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: sofiya
 * @Description: TODO
 * @Date 2020/4/24:10 下午
 * @Email: wangjie@znjs.com
 */

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    String GetUserPoint(@PathVariable int id){
        return userService.Sel(id).toString();
    }

}
