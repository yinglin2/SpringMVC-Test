package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("springmvc/hello") //对外访问定制 到handlerMapping注册的注解
    @ResponseBody //直接返回字符串给前端，不要找视图解释器！！
    public String hello() {
        System.out.println("HelloController hello");
        return "hello springmvc";
    }
}
