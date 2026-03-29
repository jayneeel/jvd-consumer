package com.jayneel.jvd_consumer.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.jayneel.jvd_consumer.service.JobService.*(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint proceedingJoinPoint, int postId) throws Throwable {
        if(postId < 0){
            LOGGER.info("PostId is negative {}", postId);
            postId = Math.abs(postId);
        }

        Object object = proceedingJoinPoint.proceed(new Object[]{postId});

        return object;
    }


}
