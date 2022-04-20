package com.budget.budget.service;

import com.budget.budget.dao.DailyExpenseDao;
import com.budget.budget.entity.DailyExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyExpenseServiceIMPL implements DailyExpenseService {

    // Injecting the daily expense dao layer
    private final DailyExpenseDao dailyExpenseDao;

    @Autowired
    public DailyExpenseServiceIMPL(DailyExpenseDao dailyExpenseDao) {
        this.dailyExpenseDao = dailyExpenseDao;
    }

    @Override
    public List<DailyExpense> findAll() {
        return dailyExpenseDao.findAll();
    }

    @Override
    public Object findById(int dailyExpenseId) {
        return dailyExpenseDao.findById(dailyExpenseId);
    }

//    @Override
//    public List<DailyExpense> listExpenseByCategory() {
//        return dailyExpenseDao.listExpenseByCategory();
//    }

    @Override
    public void saveOrUpdate(DailyExpense dailyExpense) {
        dailyExpenseDao.saveOrUpdate(dailyExpense);
    }

    @Override
    public void deleteById(int dailyExpenseId) {
        dailyExpenseDao.deleteById(dailyExpenseId);
    }
}
