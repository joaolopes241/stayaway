package org.academiadecodigo.ramsters.hackathon.persistence.dao;

import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

}
