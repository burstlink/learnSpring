package com.leeyy.springtest;

import com.leeyy.bean2.servlet.BookServlet;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IocTest06 {
    private ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext02.xml");

    @Test
    public void test02() {
        BookServlet bean1 = ioc.getBean("bookServlet", BookServlet.class);
        bean1.doGet();
    }
    @Test
    public void test01() {
        Object bean1 = ioc.getBean("boookService");
        Object bean2 = ioc.getBean("boookService");
        System.out.println(bean1==bean2);
    }

}
