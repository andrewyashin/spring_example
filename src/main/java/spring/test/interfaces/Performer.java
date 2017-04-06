package spring.test.interfaces;

import spring.test.exceptions.PerformanceException;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public interface Performer {
    void perform() throws PerformanceException;
}
