package com.leeyy.springtest;

import com.leeyy.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest04 {
    private ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01() {
        System.out.println(ioc.getBean(Book.class));
//        ioc.close();
    }

}
