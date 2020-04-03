package com.znmq.point.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: sofiya
 * @Description: TODO
 * @Date 2020/4/2  4:08 下午
 * @Email: wangjie@znjs.com
 */

@Controller
public class HomeController {
    @RequestMapping("/test")
    public String Index(){
        return "hello znmq!";
    }
}
