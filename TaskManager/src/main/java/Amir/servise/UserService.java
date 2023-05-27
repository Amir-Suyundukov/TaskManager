package Amir.servise;
/**
 * сервис юзер
 */
import Amir.Entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findOne(Integer id);
    User findByName(String name);
    List<User> findAll();
    User findByPassword(Integer password);
    User findByLogin(String login);
    User getUserOnline();
     void setUserOnline(User user);
}
