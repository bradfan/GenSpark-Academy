package com.budget.budget.service;

import com.budget.budget.entity.DailyExpense;

import java.util.List;

public interface DailyExpenseService {
    List<DailyExpense> findAll();

    Object findById(int dailyExpenseId);

//    List<DailyExpense> listExpenseByCategory();

    void saveOrUpdate(DailyExpense dailyExpense);

    void deleteById(int dailyExpenseId);
}
