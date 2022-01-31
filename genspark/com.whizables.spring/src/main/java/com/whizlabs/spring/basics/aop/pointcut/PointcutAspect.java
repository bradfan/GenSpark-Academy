package com.whizlabs.spring.basics.aop.pointcut;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {
    @Pointcut("execution(* print*())")
    private void noParamExecutionPointcut() {
    }

//    @Before("noParamExecutionPointcut()")
//    private void noParamExecutionAdvice() {
//        System.out.println("Printed by noParamExecutionAdvice.");
//    }

    @Pointcut("execution(public void com.whizlabs..Person.*(*))")
    private void singleParamExecutionPointcut() {}

//
//    @Before("singleParamExecutionPointcut()")
//    private void singleParamExecutionAdvice() {
//        System.out.println("Printed by singleParameterExecutionAdvice.");
//    }

@Before("noParamExecutionPointcut() && singleParamExecutionPointcut()")
    private void executionAdvice() {
    System.out.println("Printed by executionAdvice.");
    }
}
