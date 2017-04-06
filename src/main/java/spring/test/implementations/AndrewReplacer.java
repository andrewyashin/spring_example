package spring.test.implementations;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 3/27/17.
 */
public class AndrewReplacer implements MethodReplacer{
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "Andrew HERE AHAHAHa";
    }
}
