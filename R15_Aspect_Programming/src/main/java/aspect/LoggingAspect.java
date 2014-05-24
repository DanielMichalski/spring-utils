package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author: Daniel
 */
@Aspect
public class LoggingAspect {

    @Before("allCircleMethods2()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }

    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second Advice executed.");
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {}

    @Pointcut("execution(* model.Circle.*(..))")
    public void allCircleMethods1() {}

    /**
     * Dla wszystkich elemenentów w klasie Circle
     */
    @Pointcut("within(model.Circle)")
    public void allCircleMethods2() {}

    @Pointcut("args()")
    public void testArgs() {}
}
