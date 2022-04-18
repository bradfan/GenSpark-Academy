package com.budget.budget.dao;

import com.budget.budget.entity.DailyExpense;

import java.util.List;

public interface DailyExpenseDao {

    List<DailyExpense> findAll();
        Object findById(int dailyExpenseId);
        void saveOrUpdate(DailyExpense dailyExpense);
        void deleteById(int dailyExpenseId);

}
