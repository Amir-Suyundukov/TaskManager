package Amir.servise;
/**
 * сервис юзер импл
 */
import Amir.Entity.User;
import Amir.Repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private User userOnline;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByPassword(Integer password) {
        return userRepository.findByPassword(password);
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public User getUserOnline() {
        return userOnline;
    }

    public void setUserOnline(User userOnline) {
        this.userOnline = userOnline;
    }
}
