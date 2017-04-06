package spring.test;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public class SpecialBean implements BeanNameAware {
    private String name;

    @Override
    public void setBeanName(String s) {
        name = s;
    }

    
}
