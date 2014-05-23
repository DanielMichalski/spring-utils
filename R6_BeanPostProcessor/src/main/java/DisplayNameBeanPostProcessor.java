import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author: Daniel
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Przed utworzeniem obiektu " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Po utworzeniu obiektu " + beanName);
        return bean;
    }
}
