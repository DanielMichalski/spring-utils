package without_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Author: Daniel
 */
public class Triangle{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void init() throws Exception {
        String text = "InitialingBean init method called for Triangle";
        System.out.println(text);
    }

    public void destroy() throws Exception {
        String text = "DispodableBean destroy method called for Triangle";
        System.out.println(text);
    }

    public void draw() {
        System.out.println("Triangle drawn: ");
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
        System.out.println("pointC = " + pointC);
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
