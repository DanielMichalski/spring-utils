package shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Author: Daniel
 */
public class Circle implements Shape {
    @Autowired
    @Qualifier ("pointC")
    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawing circle:");
        String text = String.format("center point = (%d,%d)", center.getX(), center.getY());
        System.out.println(text);
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
