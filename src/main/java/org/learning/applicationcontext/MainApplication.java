package org.learning.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("construction.xml");
        Room room = (Room) applicationContext.getBean("room");
        room.print();
    }
}
