package com.leeyy.springtest;

import com.leeyy.bean3.impl.MyMathCalculator;
import com.leeyy.bean3.impl.MyMathCalculator2;
import com.leeyy.bean3.inter.Calculator;
import com.leeyy.bean3.proxy.CalculatorProxy;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPTest {
    private ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext05.xml");

    @Test
    public void test01() {
//        Calculator calculator = new MyMathCalculator();
//        Calculator proxy = CalculatorProxy.getProxy(calculator);
//        proxy.add(2.0,1.0);
//        从ioc容器中回去目标对象，注意如果想要用类型，一定用他的接口类型不要用他的本类
        //aop底层就是动态代理，容器中报存的组件就是他的代理对象
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1,2);
        System.out.println(bean.getClass());
//        MyMathCalculator myMathCalculator = ioc.getBean(MyMathCalculator.class);
//        myMathCalculator.add(1.0,1.0);
        // 没有接口就是本类型
        System.out.println("===================");
        MyMathCalculator2 myMathCalculator2 = ioc.getBean(MyMathCalculator2.class);
        System.out.println(myMathCalculator2.getClass());
        myMathCalculator2.add(3,4);
    }
}
