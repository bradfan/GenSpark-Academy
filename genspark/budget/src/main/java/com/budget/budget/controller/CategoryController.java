package com.budget.budget.controller;


import com.budget.budget.entity.Category;
import com.budget.budget.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React...
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the employeeService.
    @Autowired
    public CategoryController(@Qualifier("categoryServiceIMPL") CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    //This is a GET request that will read a list of all the categories.
    //http://localhost:8080/retrieveAllCategories
    @GetMapping("/retrieveAllCategories")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    //This is a GET request that will read one category selected by ID.
    //http://localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{categoryId}")
    public Object findById(@PathVariable int categoryId) {
        return categoryService.findById(categoryId);
    }

    //This is a POST request to add a new category.
    //http://localhost:8080/addCategory
    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category) {
        //also, just in case they pass an id in JSON .... set id to 0
        //this is to force a save of new item .... instead of update
        category.setId(0);

        //This will call the employeeDqoImpl.save method to save a new employee
        //through the employeeService
        categoryService.saveOrUpdate(category);
        return category;
    }

    //This is a PUT request to update an existing category.
    //http://localhost:8080/updateCategory
    @PutMapping("/updateCategory")
    public Category updateCategory(@RequestBody Category updateCategory) {
        //Notice category.setId(0); this will execute an update instead of a create
        categoryService.saveOrUpdate(updateCategory);
        return updateCategory;
    }

    //This is a DELETE request to delete an existing category.
    //http://localhost:8080/deleteCategory/1
    @DeleteMapping("/deleteCategory/{categoryId}")
    public String deleteCategory(@PathVariable int categoryId) {
        //This will execute the deleteByID.
        categoryService.deleteById(categoryId);
        return "Deleted category id : " + categoryId;
    }


}
