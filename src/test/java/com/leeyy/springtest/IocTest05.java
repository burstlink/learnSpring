package com.leeyy.springtest;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IocTest05 {
    private ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext01.xml");

    @Test
    public void test01() throws SQLException {
        System.out.println(ioc.getBean("poolSource", DataSource.class).getConnection());
//        ioc.close();
    }

}
