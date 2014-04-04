import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Shape triangle = (Triangle) context.getBean("triangle");
        Shape circle = (Shape) context.getBean("circle");

        triangle.draw();
        circle.draw();
    }
}
