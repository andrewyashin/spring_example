package spring.test.implementations.instruments;

import org.springframework.stereotype.Component;
import spring.test.interfaces.Instrument;

/**
 * Created by andrew_yashin on 3/25/17.
 */
@Component("piano")
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PIAO PIAO PIAO");
    }
}
