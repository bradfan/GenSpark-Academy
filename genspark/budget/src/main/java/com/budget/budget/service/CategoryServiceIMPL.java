package com.budget.budget.service;

import com.budget.budget.dao.CategoryDao;
import com.budget.budget.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceIMPL implements CategoryService {

    // Injecting the employee dao layer
    private final CategoryDao categoryDao;

    @Autowired
    public CategoryServiceIMPL(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Object findById(int categoryId) {
        return categoryDao.findById(categoryId);
    }

    @Override
    public void saveOrUpdate(Category category) {
        categoryDao.saveOrUpdate(category);
    }

    @Override
    public void deleteById(int categoryId) {
        categoryDao.deleteById(categoryId);
    }

}
