package com.leeyy.springtest;

import com.leeyy.bean2.service.BookService;
import com.leeyy.bean2.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @con注解用来指定spring的配置文件路径
 * @run注解指定哪种驱动来进行单元测试，默认是junit
 */
@ContextConfiguration(locations = "classpath:applicationContext02.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IocTest07 {
    @Autowired
    BookServlet bookServlet;
    @Autowired
    BookService bookService;

    @Test
    public void test01() {
        System.out.println(bookService);
        System.out.println(bookServlet);
    }

}
