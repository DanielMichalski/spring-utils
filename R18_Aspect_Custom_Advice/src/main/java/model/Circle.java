package model;

import org.springframework.beans.factory.annotation.Value;

/**
 * Author: Daniel
 */
public class Circle {

    @Value("${circle.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
