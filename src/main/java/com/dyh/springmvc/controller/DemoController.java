package com.dyh.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description:
 * author: dyh
 * date: 2022/11/9 10:56
 */
@Controller
//@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello......");
        return "hello";
    }
}
