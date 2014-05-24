package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Author: Daniel
 */
@Aspect
public class LoggingAspect {

    @Before("anyCircleMethod()")
    public void loggingAdvice(JoinPoint joinPoint) {

    }

    @AfterReturning(pointcut = "args(name)",
            returning = "returnString",
            argNames = "name,returnString")
    public void stringArgumentMethods(String name, String returnString) {
        System.out.printf("Method called with argument: %s and returns %s",
                name,
                returnString);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionAdvice(String name, RuntimeException ex) {
        System.out.println("An exception has been thrown. " + ex);
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {
    }

    @Pointcut("within(model.Circle)")
    public void anyCircleMethod() {
    }
}
