package org.academiadecodigo.ramsters.hackathon.persistence.dao.jpa;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.BeachDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBeachDao extends GenericJpaDao<Beach> implements BeachDao {

     public JpaBeachDao() {
         super(Beach.class);
     }

}
