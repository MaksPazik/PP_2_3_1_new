package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;

import web.model.User;

import javax.validation.Valid;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    private final UserDAO userDao;

    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Transactional
    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }
    @Transactional
    @Override
    public void updateUser(@Valid User user) {
        userDao.updateUser(user);
    }
}
