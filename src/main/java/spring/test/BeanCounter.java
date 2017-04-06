package spring.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by andrew_yashin on 4/6/17.
 */
@Component
public class BeanCounter implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BEAN COUNT = " + configurableListableBeanFactory.getBeanDefinitionCount());
    }
}
