package org.learning.qualifierprimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RangeRover implements Vehicle{
    @Override
    public int getLuxuryLevel() {
        return 7;
    }

    @Override
    public void printLuxuryLevel() {
        System.out.println("Luxury level of Range Rover is " + getLuxuryLevel() + ".");
    }
}
