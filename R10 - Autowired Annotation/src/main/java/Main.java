import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shapes.Shape;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Shape circle = (Shape) context.getBean("circle");
        circle.draw();
    }
}
