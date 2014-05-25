import dao.JdbCircleDao;
import model.Circle;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        JdbCircleDao dao = new JdbCircleDao();
        Circle circle = dao.getCircle(1);
        System.out.println(circle.getName());
    }
}
