package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.CustomerDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public Customer findByUsername(String username) {
        return customerDao.findByUsername(username);
    }
}
