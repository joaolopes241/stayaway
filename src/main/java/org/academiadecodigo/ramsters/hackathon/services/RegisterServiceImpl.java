package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.UserDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkAvailability(String username) {
        return userDao.findByUsername(username) == null;
    }

    @Override
    public User save(User user) {
        return userDao.saveOrUpdate(user);
    }
}
