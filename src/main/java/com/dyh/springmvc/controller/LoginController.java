package com.dyh.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * description:
 * author: dyh
 * date: 2022/11/9 11:15
 */
public class LoginController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        System.out.println("there..............");
        ModelAndView mv = new ModelAndView();
        mv.addObject("notice", "Hello World!好好好");
        mv.setViewName("success");
        return mv;
    }
}
