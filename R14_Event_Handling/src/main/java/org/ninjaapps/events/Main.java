package org.ninjaapps.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ninjaapps.events.shapes.Shape;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Shape circle = (Shape) context.getBean("circle");
        circle.draw();
    }
}
