package pl.dmichalski.spring.repository;

import pl.dmichalski.spring.domain.User;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IUserRepository {

    public void saveUser(User user);

    public User findUser(long userId);

    public List<User> findAllUsers();
}
