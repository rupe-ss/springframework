package org.learning.qualifierprimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public interface Vehicle {
    public int getLuxuryLevel();
    public void printLuxuryLevel();
}
