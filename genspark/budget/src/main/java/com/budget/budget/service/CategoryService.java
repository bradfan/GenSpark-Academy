package com.budget.budget.service;

import com.budget.budget.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Object findById(int categoryId);
    void saveOrUpdate(Category category);
    void deleteById(int categoryId);
}
