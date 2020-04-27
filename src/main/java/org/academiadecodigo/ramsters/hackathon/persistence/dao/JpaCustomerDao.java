package org.academiadecodigo.ramsters.hackathon.persistence.dao;

import org.academiadecodigo.ramsters.hackathon.persistence.model.Customer;

public class JpaCustomerDao extends GenericJpaDao<Customer> implements CustomerDao {

    public JpaCustomerDao() {
        super(Customer.class);
    }

}
