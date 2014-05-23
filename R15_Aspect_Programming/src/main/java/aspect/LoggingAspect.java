package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author: Daniel
 */
@Aspect
public class LoggingAspect {

    @Before("anyGetNameMethod()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }

    @Before("anyGetNameMethod()")
    public void secondAdvice() {
        System.out.println("Second Advice executed.");
    }

    @Pointcut("execution(* getName())")
    public void anyGetNameMethod() {}
}
