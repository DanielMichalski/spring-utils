package model;

import org.springframework.beans.factory.annotation.Value;

/**
 * Author: Daniel
 */
public class Triangle {

    @Value("${triangle.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
