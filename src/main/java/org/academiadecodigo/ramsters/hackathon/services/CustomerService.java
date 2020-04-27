package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.model.Customer;

public interface CustomerService {

    Customer findByUsername(String username);
}
