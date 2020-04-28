package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.model.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);

    User edit(User user);

    void deleteUser(User user);

    List<User> findAllUsers();
}
