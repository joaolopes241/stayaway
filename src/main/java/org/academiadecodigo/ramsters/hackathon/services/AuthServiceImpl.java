package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private String accessingCustomerUsername;
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean authenticate(String username, String pass) {
        User user = userService.findByUsername(username);
        if (user == null) {
            return false;
        }

        if(!user.getPass().equals(pass)) {
            return false;
        }

        accessingCustomerUsername = username;
        return true;
    }

    @Override
    public User getAccessingCustomer() {
        return userService.findByUsername(accessingCustomerUsername);
    }


}
