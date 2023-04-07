package com.dyh.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * author: dyh
 * date: 2022/11/30 15:38
 */
@Configuration
public class DemoBean {

    @Bean
    public void bean1(){
        System.out.println("DemoBean.bean1()");
    }

    @Bean
    public void bean2(){
        System.out.println("DemoBean.bean2()");
    }
}
