package com.leeyy.bean3.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1) //多切面执行顺序，越小越大
public class ValidateAspect {

    @Before(value = "com.leeyy.bean3.utils.LogUtils.hahaMyPoint()")
    public static void logStart(JoinPoint joinPoint){
        System.out.println("[val-method:"+joinPoint.getSignature().getName()+"]方法开始执行，用的参数是["+ Arrays.asList(joinPoint.getArgs()) +"]");
    }
    // 目标方法运返回值之后
    @AfterReturning(value = "com.leeyy.bean3.utils.LogUtils.hahaMyPoint()", returning = "res")
    public static void logReturn(JoinPoint joinPoint, Object res){
        System.out.println("[val-method:"+joinPoint.getSignature().getName()+"]方法执行完成，执行结果是["+ res +"]");
    }
    // 目标方法异常后执行
    @AfterThrowing(value = "com.leeyy.bean3.utils.LogUtils.hahaMyPoint()", throwing = "e")
    public static void logException(JoinPoint joinPoint, Exception e){
        System.out.println("[val-method:"+joinPoint.getSignature().getName()+"]方法开始执行，错误是["+ e +"]");
    }
    // 目标方法结束之后执行
    @After(value = "com.leeyy.bean3.utils.LogUtils.hahaMyPoint()")
    public static void logEnd(JoinPoint joinPoint){
        System.out.println("[val-method:"+joinPoint.getSignature().getName()+"]方法执行结束");
    }
}
