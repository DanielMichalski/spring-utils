import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ShapeService;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        ShapeService shapeService = (ShapeService) context.getBean("shapeService");

        System.out.println(shapeService.getCircle().getName());
        System.out.println(shapeService.getTriangle().getName());
    }
}
