package Amir.Repository;
/**
 * таск репоситору импл
 */
import Amir.Entity.User;
import Amir.Storage;

import java.util.List;

public class UserRepositoryImp implements UserRepository {
    @Override
    public User findByLogin(String login) {
        for (User user : Storage.getUserList()){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        Storage.getUserList().add(user);
    }

    @Override
    public User findOne(Integer id) {
        for (User user : Storage.getUserList()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByName(String name) {
        for (User user : Storage.getUserList()){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return Storage.getUserList();
    }

    @Override
    public User findByPassword(Integer password) {
        for (User user : Storage.getUserList()){
            if (user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
