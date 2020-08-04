package com.leeyy.springtest;

import com.leeyy.bean.AirPlane;
import com.leeyy.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest03 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_3.xml");

    @Test
    public void test01() {
        System.out.println(ioc.getBean("airplane01", AirPlane.class));
        System.out.println(ioc.getBean("airplane02", AirPlane.class));
        System.out.println(ioc.getBean("airplane03", AirPlane.class));
        System.out.println(ioc.getBean("myFactoryBeanImp", AirPlane.class));
    }

}
