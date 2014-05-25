package service;

import aspect.Loggable;
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

    @Loggable
    public Circle getCircle() {
        return circle;
    }

    @Loggable
    public Triangle getTriangle() {
        return triangle;
    }
}
