package pl.dmichalski.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import pl.dmichalski.spring.log.AutowiredLogger;

/**
 * Author: Daniel
 */
@Aspect
@Component
public class RepositoryStopWatchAspect {

    @AutowiredLogger
    private Logger logger;

    @Pointcut("execution(* pl.dmichalski.spring.repository..*Repository.*(..))")
    public void anyRepositoryMethod() {}

    @Around("anyRepositoryMethod()")
    public Object monitor(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch(nameOf(joinPoint));
        stopWatch.start();

        try {
            return joinPoint.proceed();
        } finally {
            stopWatch.stop();
            logger.info(stopWatch.shortSummary());
        }
    }

    private String nameOf(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        return signature.getName();
    }
}
