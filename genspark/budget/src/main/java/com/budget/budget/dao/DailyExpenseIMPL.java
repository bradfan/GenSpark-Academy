package com.budget.budget.dao;

import com.budget.budget.entity.DailyExpense;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;

import java.util.List;

@Repository
public class DailyExpenseIMPL implements DailyExpenseDao {

    //Define field for entity manager
    /*The EntityManager API is used to create and remove persistent entity instances,
        to find entities by their primary key, and to query over entities. */
    private final EntityManager entityManager;

    //    Set up constructor injection
    @Autowired
    public DailyExpenseIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public List<DailyExpense> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<DailyExpense> myQuery = currentSession.createQuery("from DailyExpense");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public DailyExpense findById(int dailyExpenseId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(DailyExpense.class, dailyExpenseId);
    }

//    @Override
//    @Transactional
//    @SuppressWarnings("unchecked")
//    public List<DailyExpense> listExpenseByCategory() {
//        Session currentSession = entityManager.unwrap(Session.class);
//        return entityManager.createQuery("SELECT SUM(e.expense) AS total_spent, c.category_desc FROM  daily_expense e\n" +
//                        "JOIN  category c ON e.category_id = c.id\n" +
//                        "GROUP BY c.id")
////                .setParameter("artistName", artistName)
//                .getResultList();
//    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(DailyExpense dailyExpense) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(dailyExpense);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int dailyExpenseId) {
        Session currentSession = entityManager.unwrap(Session.class);
        DailyExpense dailyExpense = currentSession.get(DailyExpense.class, dailyExpenseId);
        currentSession.delete(dailyExpense);
    }

}
