package org.academiadecodigo.ramsters.hackathon.persistence.dao;

import org.academiadecodigo.ramsters.hackathon.persistence.model.AbstractModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDao<T extends AbstractModel> implements GenericDao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findByUsername(String username) {
        return em.find(modelType, username);
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    @Override
    public void delete(T modelObject) {
        em.remove(em.find(modelType, modelObject));
    }
}
