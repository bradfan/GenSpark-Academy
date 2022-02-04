package com.homes.home_list.entity;

import javax.persistence.*;

@Entity
@Table(name= "homes")
public class Homes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street_address")
    private int streetAddress;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "city_name")
    private String phoneNumber;

    @Column(name = "state")
    private String state;

//    default constructor

    public Homes() {

    }

    public Homes(int id, int streetAddress, String streetName, String phoneNumber, String state) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.streetName = streetName;
        this.phoneNumber = phoneNumber;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(int streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "HomesController{" +
                "id=" + id +
                ", streetAddress=" + streetAddress +
                ", streetName='" + streetName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

