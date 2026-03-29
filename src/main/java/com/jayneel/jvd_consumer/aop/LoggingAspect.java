package com.jayneel.jvd_consumer.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.jayneel.jvd_consumer.service.JobService.*(..))")
    public void logMethodCall(JoinPoint joinPoint){
        LOGGER.info("Method Called {}", joinPoint.getSignature().getName());
    }

    @After("execution(* com.jayneel.jvd_consumer.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint joinPoint){
        LOGGER.info("Method Executed {}", joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* com.jayneel.jvd_consumer.service.JobService.*(..))")
    public void logMethodException(JoinPoint joinPoint){
        LOGGER.info("Method Crashed {}", joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.jayneel.jvd_consumer.service.JobService.*(..))")
    public void logMethodReturning(JoinPoint joinPoint){
        LOGGER.info("Method Returned {}", joinPoint.getSignature().getName());
    }
}
