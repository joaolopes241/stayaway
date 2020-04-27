package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.model.User;

public interface AuthService {

    boolean authenticate(String username, String pass);

    User getAccessingCustomer();
}
