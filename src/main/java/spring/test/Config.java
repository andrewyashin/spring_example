package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.events.Course;
import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Performer;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class Config {
    public static void main(String[] args) throws PerformanceException{
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Performer carl = (Performer) context.getBean("kenny");
        carl.perform();

        Course course = new Course();
        context.publishEvent(course);



    }
}
