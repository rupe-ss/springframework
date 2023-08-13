package org.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*//So, I need a vehicle. How I get one. We can create an reference.
        Car car = new Car();
        //Here we got the Vehicle car but if we want bike in future then we have to change both side right and left.
        //It looks not a big deal right now with small projects but things will be messy when its Enterprise codes.
        //How we solve thi problem, we can with Interface. But that will solve only left part we still need to change right side.
        Vehicle vehicle = new Car();
        vehicle.drive();
        //But why even change a right side, to solve this we need a Spring Framework*/

        /*
        BeanFactory beanFactory = new BeanFactory();
        Both Bean Factory and ApplicationContext comes from SpringFramework. Use BeanFactory for small project but always use ApplicationContext for large Enterprise project.
        ApplicationContext is superset of BeanFactory so whatever features is provided by BeanFactory, ApplicationContext provide it too.
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        /*
        We are using ApplicationContext to create a Bean
        getBean is method from ApplicationContext, but this method will give Object of Objects so we have to typeCase to Object to Vehicle
         */
        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();

        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre);
    }
}
