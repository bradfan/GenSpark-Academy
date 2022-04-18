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

    @Column(name = "category_desc") //This will map the category description field to the column named category_desc in the table.
    private String categoryDescription;

    public Category() {

    }

    public Category(int id, String categoryDescription) {
        this.id = id;
        this.categoryDescription = categoryDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
