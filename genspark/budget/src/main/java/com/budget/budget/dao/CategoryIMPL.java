package com.budget.budget.dao;

import com.budget.budget.entity.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import java.util.List;

@Repository
public class CategoryIMPL implements CategoryDao {

    //Define field for entity manager
    /*The EntityManager API is used to create and remove persistent entity instances,
        to find entities by their primary key, and to query over entities. */
    private final EntityManager entityManager;

    //Set up constructor injection
    @Autowired
    public CategoryIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Category> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Category> myQuery = currentSession.createQuery("from Category");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public Category findById(int categoryId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Category.class, categoryId);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(Category category) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(category);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int categoryId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Category category = currentSession.get(Category.class, categoryId);
        currentSession.delete(category);
    }
}
