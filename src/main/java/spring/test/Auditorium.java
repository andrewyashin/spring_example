package spring.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class Auditorium {
    public void turnLightOn(){
        System.out.println("turnLightOn");
    }

    public void turnLightOff(){
        System.out.println("turnLightOff");
    }
}
