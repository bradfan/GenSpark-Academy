package com.car_parts_assignment.car_parts.entity;


import javax.persistence.*;

@Entity
@Table(name = "car_part")
public class Part {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "part_name")
    private String carPart;

    @Column(name = "in_stock")
    private int inStock;

    @Column(name = "car_model")
    private String carModel;

//    default constructor
    public Part() {

    }

    public Part(int id, String carPart, int inStock, String carModel) {
        this.id = id;
        this.carPart = carPart;
        this.inStock = inStock;
        this.carModel = carModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarPart() {
        return carPart;
    }

    public void setCarPart(String carPart) {
        this.carPart = carPart;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", carPart='" + carPart + '\'' +
                ", inStock='" + inStock + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
