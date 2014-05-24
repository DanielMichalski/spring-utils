package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Author: Daniel
 */
@Aspect
public class LoggingAspect {

    @Around("@annotation(Loggable)")
    public Object myArroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        Object returnValue = null;

        try {
            System.out.println("Before advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After avice");
        } catch (Throwable throwable) {
            System.out.println("After throwing");
        }

        System.out.println("After finally");
        return returnValue;
    }
}
