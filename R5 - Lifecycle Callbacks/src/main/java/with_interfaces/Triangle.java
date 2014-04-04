package with_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Author: Daniel
 */
public class Triangle implements InitializingBean, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    @Override
    public void afterPropertiesSet() throws Exception {
        String text = "InitialingBean init method called for with_interfaces.Triangle";
        System.out.println(text);
    }

    @Override
    public void destroy() throws Exception {
        String text = "DispodableBean destroy method called for with_interfaces.Triangle";
        System.out.println(text);
    }

    public void draw() {
        System.out.println("with_interfaces.Triangle drawn: ");
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
