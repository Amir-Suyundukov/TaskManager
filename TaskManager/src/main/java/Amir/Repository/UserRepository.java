package Amir.Repository;
/**
 * юзер репоситору
 */
import Amir.Entity.Project;
import Amir.Entity.Task;
import Amir.Entity.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    User findOne(Integer id);
    User findByName(String name);
    List<User> findAll();
    User findByPassword(Integer password);
    User findByLogin(String login);

}
