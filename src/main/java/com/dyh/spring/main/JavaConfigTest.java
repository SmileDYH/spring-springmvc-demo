package com.dyh.spring.main;

import com.dyh.spring.bean.DemoController;
import com.dyh.spring.config.JavaConfig;
import com.dyh.spring.model.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description: JavaConfig方式启动（注解方式）
 * author: dyh
 * date: 2022/11/30 15:43
 */
public class JavaConfigTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);


    }
}
