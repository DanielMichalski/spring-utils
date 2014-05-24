package service;

import model.Circle;
import model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Daniel
 */
public class ShapeService {
    @Autowired
    private Circle circle;

    @Autowired
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
