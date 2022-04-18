package com.budget.budget.entity;

import javax.persistence.*;

@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "category") //This is for the actual name of the database table we are mapping to the class.
public class Category {

    //Define fields
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "id") //This is mapping the primary key to the id column in the table.
    private int id;

    @Column(name = "category_desc") //This will map the jobTitle field to the column named job_title in the table.
    private String categoryDesc;

    public Category() {

    }

    public Category(int id, String categoryDesc) {
        this.id = id;
        this.categoryDesc = categoryDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryDesc='" + categoryDesc + '\'' +
                '}';
    }
}
