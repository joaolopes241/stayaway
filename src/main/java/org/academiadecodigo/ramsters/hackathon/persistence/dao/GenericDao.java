package org.academiadecodigo.ramsters.hackathon.persistence.dao;

import org.academiadecodigo.ramsters.hackathon.persistence.model.AbstractModel;

import java.util.List;

public interface GenericDao<T extends AbstractModel> {

    List<T> findAll();

    T findByUsername(String name);

    T saveOrUpdate(T modelObject);

    void delete(T modelObject);
}
