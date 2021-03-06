package com.car_parts_assignment.car_parts.dao;


import com.car_parts_assignment.car_parts.entity.Part;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
public class PartsIMPL implements PartsDAO {

    private final EntityManager entityManager;

    @Autowired
    public PartsIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Part> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Part> myQuery = currentSession.createQuery("from Part");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Part findById(int partId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Part.class, partId);
    }



    @Override
    @Transactional
    public void saveOrUpdate(Part thePart) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(thePart);
    }

    @Override
    @Transactional
    public void deleteById(int partId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Part myPart = currentSession.get(Part.class, partId);
        currentSession.delete(myPart);
    }

}
