package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Author: Daniel
 */
public class LoggingAspect {

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

    public void loggingAdvice() {
        System.out.println("Logging from the advice");
    }
}
