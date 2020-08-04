package com.leeyy.springtest;

import com.leeyy.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest02 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_2.xml");

    @Test
    public void test01() {
        System.out.println(ioc.getBean("person01", Person.class).getLastName() == null);
        System.out.println(ioc.getBean("person01", Person.class).getCar());
        System.out.println(ioc.getBean("person01", Person.class).getCar());
        System.out.println(ioc.getBean("person01", Person.class).getBooks());
        System.out.println(ioc.getBean("person01", Person.class).getMaps());
        System.out.println(ioc.getBean("person01", Person.class).getProperties());
        System.out.println(ioc.getBean("person02", Person.class).getMaps());
        System.out.println(ioc.getBean("person03", Person.class).getCar());
        System.out.println(ioc.getBean("person04", Person.class));
    }
}
