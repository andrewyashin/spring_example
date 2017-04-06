package spring.test.implementations;

import spring.test.interfaces.Lime;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public class LimeImpl implements Lime {
    @Override
    public String drink() {
        return "Lime LIme Lime";
    }
}
