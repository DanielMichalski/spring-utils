package shapes;

import org.springframework.beans.factory.annotation.Required;

/**
 * Author: Daniel
 */
public class Circle implements Shape {
    private Point center;

    @Override
    public void draw() {
        System.out.println("Drawind circle:");
        String text = String.format("center point = (%d,%d)", center.getX(), center.getY());
        System.out.println(text);
    }

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }
}
