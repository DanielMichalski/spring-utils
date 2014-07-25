package pl.dmichalski.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.spring.domain.User;
import pl.dmichalski.spring.repository.IUserRepository;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("rootContext.xml");

        IUserRepository userRepository =
                context.getBean(IUserRepository.class);

        userRepository.findAllUsers();
        userRepository.findUser(1L);
        userRepository.saveUser(new User());
    }
}
