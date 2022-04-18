package com.budget.budget.dao;

import com.budget.budget.entity.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
    Object findById(int categoryId);
    void saveOrUpdate(Category category);
    void deleteById(int categoryId);
}
