package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.UserDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User edit(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
