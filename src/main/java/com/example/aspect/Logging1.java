package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging1 {

    @Pointcut("execution(public * com.example.controller.Aopcontroller.durant(int)) && args(point))")
    public void logging1(int point) {
    }

    /**
     * @description 使用环绕通知
     */
    @Around("logging1(point)")
    public void doAroundGameData(ProceedingJoinPoint pjp, int point) throws Throwable {
        try {
            System.out.println("哈登运动前的热身");
            pjp.proceed();
            System.out.println("球星本场得到" + point + "分");
        } catch (Throwable e) {
            System.out.println("异常通知：球迷要求退票！");
        }
    }
}
