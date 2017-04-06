package spring.test.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public class CourseFullEvent extends ApplicationEvent {
    private Course course;

    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }

    public Course getCourse(){
        return course;
    }
}
