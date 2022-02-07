package com.homes.home_list.dao;


import com.homes.home_list.entity.Homes;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HomesIMPL implements HomesDAO {

    private final EntityManager entityManager;

    @Autowired
    public HomesIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Homes> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Homes> myQuery = currentSession.createQuery("from Homes");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Homes findById(int contactId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Homes.class, contactId);
    }

    @Override
    @Transactional
    public  void saveOrUpdate(Homes theHomes) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theHomes);
    }

    @Override
    @Transactional
    public void deleteById(int contactId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Homes myHomes = currentSession.get(Homes.class, contactId);
        currentSession.delete(myHomes);
    }
}
