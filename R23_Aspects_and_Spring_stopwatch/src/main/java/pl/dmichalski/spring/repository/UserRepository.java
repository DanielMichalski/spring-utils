package pl.dmichalski.spring.repository;

import org.springframework.stereotype.Repository;
import pl.dmichalski.spring.domain.User;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Author: Daniel
 */
@Repository
public class UserRepository  implements IUserRepository {
    @Override
    public void saveUser(User user) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUser(long userId) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
