package org.learning.javaconfigbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Samsung{
    public void type(){
        System.out.println("This is a samsung phone.");
    }
}

@Component
class Iphone{
    public void type(){
        System.out.println("This is a iphone phone.");
    }
}

@Configuration
//This is a class that manage Bean, so we have to annotate this class with @Configuration
class AnnotationConfig{
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
    @Bean
    public Iphone getIphone(){
        return new Iphone();
    }
}

public class ApplicationMain {
    public static void main(String[] args) {
        //Here we are passing AnnotationConfig.class because we don't have xml configuration.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.type();
        Iphone iphone = applicationContext.getBean(Iphone.class);
        iphone.type();
    }
}
