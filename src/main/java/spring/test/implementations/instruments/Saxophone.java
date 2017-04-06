package spring.test.implementations.instruments;

import org.springframework.stereotype.Component;
import spring.test.interfaces.Instrument;

/**
 * Created by andrew_yashin on 3/25/17.
 */
@Component("saxophone")
public class Saxophone implements Instrument {
    public Saxophone(){}


    @Override
    public void play() {
        System.out.println("TOO TOO TOO");
    }
}
