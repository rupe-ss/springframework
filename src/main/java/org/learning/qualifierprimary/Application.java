package org.learning.qualifierprimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        vehicle.printLuxuryLevel();
    }
}
