import java.awt.*;

/**
 * Author: Daniel
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        System.out.println("Triangle points:");
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
        System.out.println("pointC = " + pointC);
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
}
