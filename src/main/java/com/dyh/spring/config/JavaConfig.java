package com.dyh.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * author: dyh
 * date: 2022/11/30 15:36
 */

@Configuration
@ComponentScan("com.dyh.spring.bean")
public class JavaConfig {
    JavaConfig(){
        System.out.println("JavaConfig 构造方法...");
    }
}
