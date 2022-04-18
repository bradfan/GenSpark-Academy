package com.budget.budget.controller;

import com.budget.budget.entity.DailyExpense;
import com.budget.budget.service.DailyExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React...
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class DailyExpenseController {

    private final DailyExpenseService dailyExpenseService;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the employeeService.
    @Autowired
    public DailyExpenseController(@Qualifier("dailyExpenseServiceIMPL") DailyExpenseService dailyExpenseService) {
        this.dailyExpenseService = dailyExpenseService;
    }

    //This is a GET request that will read a list of all the dailyExpenses.
    //http://localhost:8080/retrieveAllDailyExpense
    @GetMapping("/retrieveAllDailyExpense")
    public List<DailyExpense> findAll() {
        return dailyExpenseService.findAll();
    }

    //This is a GET request that will read one employee selected by ID.
    //http://localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{dailyExpenseId}")
    public Object findById(@PathVariable int dailyExpenseId) {
        return dailyExpenseService.findById(dailyExpenseId);
    }

    //This is a POST request to add a new daily expense.
    //http://localhost:8080/addDailyExpense
    @PostMapping("/addDailyExpense")
    public DailyExpense addDailyExpense(@RequestBody DailyExpense dailyExpense) {
        //also, just in case they pass an id in JSON .... set id to 0
        //this is to force a save of new item .... instead of update
        dailyExpense.setId(0);

        //This will call the dailyExpenseDaoImpl.save method to save a new employee
        //through the employeeService
        dailyExpenseService.saveOrUpdate(dailyExpense);
        return dailyExpense;
    }

    //This is a PUT request to update an existing expense.
    //http://localhost:8080/updateExpense
    @PutMapping("/updateExpense")
    public DailyExpense updateExpense(@RequestBody DailyExpense updateDailyExpense) {
        //Notice theEmployee.setId(0); this will execute an update instead of a create
        dailyExpenseService.saveOrUpdate(updateDailyExpense);
        return updateDailyExpense;
    }

    //This is a DELETE request to delete an existing expense.
    //http://localhost:8080/deleteExpense/1
    @DeleteMapping("/deleteExpense/{dailyExpenseId}")
    public String deleteExpense(@PathVariable int dailyExpenseId) {
        //This will execute the deleteByID.
        dailyExpenseService.deleteById(dailyExpenseId);
        return "Deleted employee id : " + dailyExpenseId;
    }


}
