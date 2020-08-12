package com.leeyy.bean3.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
 * 将切面类中的这些通知方法动态的在目标方法运行的各个位置切入
 * @Before：在目标方法之前                              前置通知
 * @After：在目标方法之后                               后置通知
 * @AfterReturning：在目标方法正常返回之后               返回通知
 * @AfterThrowing：在目标方法抛出异常之后                异常通知
 * @Around：环绕                                       环绕通知
 * 切入点表达式写法
 *  固定格式execution(访问权限符 返回值类型 方法类全名(参数表))
 *  *->匹配任意字符/参数
 *  ..->匹配任意对个参数，匹配多层路径
 *  权限位置 public可写可不写
 *  &&：切入的位置满足两个表达式
 *  ||：两个满足一个
 *  !：非，不满足的都行
 * 通知方法的执行顺序：
 *  正常执行：@Before前置通知---@After后置通知---@AfterReturning返回通知
 *  异常执行：@Before前置通知---@After后置通知---@AfterThrowing异常通知
 * JointPoint包含方法的详细信息
 * throwing="" 告诉哪个参数来接受异常
 * returning=""告诉哪个参数接受返回值
 * Except指定接受那些异常
 *
 * 抽取可重用的切入点表达式
 *  1、随便声明一个没有实现的返回void的空方法
 *  2、给方法标注上Pointcut
 *
 * 四合一就是环绕通知
 *  环绕通知中有一个参数
 *   优先于普通通知，新的顺序：环绕前置--普通前置--目标方法执行--环绕正常返回/出现异常--环绕后置--普通后置-普通返回
 *
 */
@Aspect
@Component
public class LogUtils {

    @Pointcut("execution(public double com.leeyy.bean3.impl.MyMathCalculator*.*(double ,double )))")
    public void hahaMyPoint(){

    }

    // 目标方法执行之前执行
    // execution(访问权限符 返回值类型 方法类全名(参数表))
    @Before(value = "hahaMyPoint()")
    public static void logStart(JoinPoint joinPoint){
        System.out.println("[Log method:"+joinPoint.getSignature().getName()+"]方法开始执行，用的参数是["+ Arrays.asList(joinPoint.getArgs()) +"]");
    }
    // 目标方法运返回值之后
    @AfterReturning(value = "hahaMyPoint()", returning = "res")
    public static void logReturn(JoinPoint joinPoint, Object res){
        System.out.println("[Log method:"+joinPoint.getSignature().getName()+"]方法执行完成，执行结果是["+ res +"]");
    }
    // 目标方法异常后执行
    @AfterThrowing(value = "hahaMyPoint()", throwing = "e")
    public static void logException(JoinPoint joinPoint, Exception e){
        System.out.println("[Log method:"+joinPoint.getSignature().getName()+"]方法开始执行，错误是["+ e +"]");
    }
    // 目标方法结束之后执行
    @After(value = "hahaMyPoint()")
    public static void logEnd(JoinPoint joinPoint){
        System.out.println("[Log method:"+joinPoint.getSignature().getName()+"]方法执行结束");
    }

//    @Around("hahaMyPoint()")
//    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
//        // 就是利用反射调用目标方法
//        Object proceed = pjp.proceed(pjp.getArgs());
//        System.out.println("环绕hahah。。。");
//        //
//        return proceed;
//    }
}
