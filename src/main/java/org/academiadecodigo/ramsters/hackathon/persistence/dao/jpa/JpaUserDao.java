package org.academiadecodigo.ramsters.hackathon.persistence.dao.jpa;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.UserDao;
import org.academiadecodigo.ramsters.hackathon.persistence.dao.jpa.GenericJpaDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

}
