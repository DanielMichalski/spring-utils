import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shapes.Shape;
import shapes.Triangle;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Shape triangle1 = (Triangle) context.getBean("triangle");
        Shape triangle2 = (Triangle) context.getBean("triangle-alias");
        Shape triangle3 = (Triangle) context.getBean("triangle-name");

        triangle1.draw();
        triangle2.draw();
        triangle3.draw();
    }
}
