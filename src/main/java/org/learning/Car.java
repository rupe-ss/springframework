package org.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired
    Tyre tyre;

    public void drive(){
        System.out.println("I need car to drive." + " Good" + tyre);
    }
}
