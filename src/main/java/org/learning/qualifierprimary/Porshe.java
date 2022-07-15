package org.learning.qualifierprimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Porshe implements Vehicle{
    @Override
    public int getLuxuryLevel() {
        return 6;
    }

    @Override
    public void printLuxuryLevel() {
        System.out.println("Luxury level of Porshe is " + getLuxuryLevel() +".");
    }
}
