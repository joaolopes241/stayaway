package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.CustomerDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private Integer accessingCustomerId;
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public boolean authenticate(String username, String pass) {
        Customer customer = customerService.findByUsername(username);
        if (customer == null) {
            return false;
        }

        if(customer.getPass() != pass) {
            return false;
        }

        accessingCustomerId = customer.getId();
        return true;
    }

    @Override
    public Customer getAccessingCustomer() {
        return customerService.get(accessingCustomerId);
    }


}
