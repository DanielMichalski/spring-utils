import java.util.List;

/**
 * Author: Daniel
 */
public class Triangle {
    private List<Point> points;

    public void draw() {
        System.out.println("Triangle with points: ");

        for (Point point : points) {
            System.out.println(point);
        }
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
