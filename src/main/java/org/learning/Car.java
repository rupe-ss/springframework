package org.learning;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive(){
        System.out.println("I need car to drive");
    }
}
