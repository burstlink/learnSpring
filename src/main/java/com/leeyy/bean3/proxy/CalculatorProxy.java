package com.leeyy.bean3.proxy;

import com.leeyy.bean3.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*
 * 生成代理对象
 */
public class CalculatorProxy {
    public static Calculator getProxy(final Calculator calculator) {
        // 方法执行器
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 利用反射执行目标方法
                System.out.println("这是动态代理将要帮你执行方法。。。");
                System.out.println("["+method.getName()+"]方法开始执行，用的参数列表["+ Arrays.asList(args) +"]");
                Object res = method.invoke(calculator, args);
                System.out.println("["+method.getName()+"]方法开始执行，值为["+ res +"]");

                return res;
            }
        };
        Class<?>[] inteface = calculator.getClass().getInterfaces();
        ClassLoader loader = calculator.getClass().getClassLoader();
        Object proxyInstance = Proxy.newProxyInstance(loader, inteface, h);
        return (Calculator) proxyInstance;
    }

}
