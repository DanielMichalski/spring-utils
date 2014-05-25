package service;

import aspect.LoggingAspect;
import model.Circle;

/**
 * Author: Daniel
 */
public class ShapeServiceProxy extends ShapeService {
    @Override
    public Circle getCircle() {
        LoggingAspect loggingAspect = new LoggingAspect();
        loggingAspect.loggingAdvice();
        return super.getCircle();
    }
}
