package com.budget.budget.entity;

import javax.persistence.*;

//Employee Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "daily_expense") //This is for the actual name of the database table we are mapping to the class.
public class DailyExpense {

    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "id") //This is mapping the primary key to the id column in the table.
    private int id;

    @Column(name = "expense") //This will map the expense field to the column named expense in the table.
    private String expense;

    @Column(name = "category_id") //This will map the categoryId field to the column named category_id in the table.
    private String categoryId;

    @Column(name = "location") //This will map the location field to the column named location in the table.
    private String location;

    @Column(name = "date_of_expense") //This will map the dateOfExpense field to the column named date_of_expense in the table.
    private String dateOfExpense;

    public DailyExpense() {

    }

    public DailyExpense(int id, String expense, String categoryId, String location, String dateOfExpense) {
        this.id = id;
        this.expense = expense;
        this.categoryId = categoryId;
        this.location = location;
        this.dateOfExpense = dateOfExpense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDateOfExpense() {
        return dateOfExpense;
    }

    public void setDateOfExpense(String dateOfExpense) {
        this.dateOfExpense = dateOfExpense;
    }

    @Override
    public String toString() {
        return "DailyExpense{" +
                "id=" + id +
                ", expense='" + expense + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", location='" + location + '\'' +
                ", dateOfExpense='" + dateOfExpense + '\'' +
                '}';
    }
}
