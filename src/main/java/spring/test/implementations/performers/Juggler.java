package spring.test.implementations.performers;

import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Performer;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
