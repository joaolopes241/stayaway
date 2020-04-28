package org.academiadecodigo.ramsters.hackathon.persistence.dao;

import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBeachDao extends GenericJpaDao<Beach> implements BeachDao {

     public JpaBeachDao() {
         super(Beach.class);
     }
}
