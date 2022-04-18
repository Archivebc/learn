package com.example.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
    @Pointcut("execution(public * com.example.controller.Aopcontroller.*(..)))")
    public void logging() {

    }

    /**
     * @description 在连接点执行之前执行的通知
     */
    @Before("logging()")
    public void doBefore() {
        System.out.println("经纪人正在处理球星赛前事务!");
    }

    /**
     * @description 在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("logging()")
    public void doAfterGame() {
        System.out.println("经纪人为球星表现疯狂鼓掌！");
    }

    /**
     * @description 在连接点执行之后执行的通知（返回通知）
     */
    @AfterReturning("logging()")
    public void doAfterReturningGame() {
        System.out.println("返回通知：经纪人为球星表现疯狂鼓掌！");
    }

    /**
     * @description 在连接点执行之后执行的通知（异常通知）
     */
    @AfterThrowing("logging()")
    public void doAfterThrowingGame() {
        System.out.println("异常通知：球迷要求退票！");
    }
}
