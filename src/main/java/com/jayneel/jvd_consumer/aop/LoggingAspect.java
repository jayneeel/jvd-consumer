package com.jayneel.jvd_consumer.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.jayneel.jvd_consumer.service.JobService.*(..))")
    public void logMethodCall(){
        LOGGER.info("Method Called");
    }
}
