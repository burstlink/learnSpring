package com.leeyy.springtest;

import com.leeyy.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc_1.xml");

    /*
     * 容器中的对象在容器创建的时候创建的
     * 同一个组建在ioc容器中是单实例，容器启动好后已经准备好了
     * ioc在创建组件对象的是欧会调用set方法，getter/setter自带生成
     */
    @Test
    public void test01(){
//        System.out.println("容器启动了。。。");
        Person p1 = (Person) ioc.getBean("person01");
        System.out.println(p1);

    }

    /*
     * 按照类型找的花不能有多个统一类型的，多个同类型用id找
     */
    @Test
    public void test02(){
        Person p3 = ioc.getBean("person03", Person.class);
        System.out.println(p3);
        Person p4 = ioc.getBean("person04", Person.class);
        System.out.println(p4);

    }
}
