package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Performer;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public class Config2 {
    public static void main(String[] args) throws PerformanceException{
        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");

        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }
}
