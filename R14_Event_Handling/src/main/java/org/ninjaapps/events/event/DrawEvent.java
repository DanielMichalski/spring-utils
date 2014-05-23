package org.ninjaapps.events.event;

import org.springframework.context.ApplicationEvent;

/**
 * Author: Daniel
 */
public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Draw Event Occured";
    }
}
