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

@Configuration
class AnnotationConfig{
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
}

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.type();
    }
}
