package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author: Daniel
 */
@Aspect
public class LoggingAspect {
    @Around("allGetters()")
    public Object myArroundAdvice(ProceedingJoinPoint joinPoint) {
        Object returnValue = null;

        String methodName = joinPoint.getSignature().getName();

        try {
            System.out.println("Before " + methodName);
            returnValue = joinPoint.proceed();
            System.out.println("After " + methodName);
        } catch (Throwable e) {
            System.out.println("After throwing " + methodName);
        }

        System.out.println("After finally " + methodName);
        return returnValue;
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {}
}
