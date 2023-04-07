package com.dyh.spring.main;

import com.dyh.spring.model.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:application.xml");
        //我们的对象都在spring中管理，如果要使用，直接取出来即可。
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
        System.out.println("hello");
    }
}