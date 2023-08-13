package org.learning.qualifierprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    @Qualifier("porshe")
    Vehicle vehicle1;

    public Vehicle getVehicle1() {
        return vehicle1;
    }

    public void setVehicle1(Vehicle vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        vehicle.printLuxuryLevel();

        Application application = applicationContext.getBean(Application.class);
        application.getVehicle1().printLuxuryLevel();
    }
}
