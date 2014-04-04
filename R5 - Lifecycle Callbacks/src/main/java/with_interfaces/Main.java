package with_interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context_with.xml");

        context.registerShutdownHook();

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
