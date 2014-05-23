package org.ninjaapps.events.shapes;

import org.ninjaapps.events.event.DrawEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: Daniel
 */
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    @Autowired
    @Qualifier("center")
    private Point center;

    @Autowired
    private MessageSource messageSource;

    private ApplicationEventPublisher publisher;

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage(
                "drawing.circle",
                null,
                null));

        System.out.println(messageSource.getMessage(
                "drawing.point",
                new Object[] {center.getX(), center.getY()},
                null));

        publisher.publishEvent(new DrawEvent(this));
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
