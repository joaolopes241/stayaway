package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.model.User;

public interface RegisterService {

    boolean checkAvailability(String username);

    User save(User user);
}
