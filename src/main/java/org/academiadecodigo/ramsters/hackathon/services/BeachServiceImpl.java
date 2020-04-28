package org.academiadecodigo.ramsters.hackathon.services;

import org.academiadecodigo.ramsters.hackathon.persistence.dao.BeachDao;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeachServiceImpl implements BeachService{

    private BeachDao beachDao;


    public BeachDao getBeachDao() {
        return beachDao;
    }

    @Autowired
    public void setBeachDao(BeachDao beachDao) {
        this.beachDao = beachDao;
    }


    public List<Beach> list() {
        return beachDao.findAll();
    }
}
