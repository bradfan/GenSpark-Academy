package com.widget.trainingAPI.entity;


import javax.persistence.*;

@Entity
@Table(name = "widget")
public class Widget {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "widget_name")
    private String widgetName;

    @Column(name = "widget_purpose")
    private String widgetPurpose;

    @Column(name = "distributor")
    private String distributor;

    @Column(name = "price")
    private int price;

//    default Constructor

    public Widget() {

    }

    public Widget(int id, String widgetName, String widgetPurpose, String distributor, int price) {
        this.id = id;
        this.widgetName = widgetName;
        this.widgetPurpose = widgetPurpose;
        this.distributor = distributor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWidgetName() {
        return widgetName;
    }

    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName;
    }

    public String getWidgetPurpose() {
        return widgetPurpose;
    }

    public void setWidgetPurpose(String widgetPurpose) {
        this.widgetPurpose = widgetPurpose;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "id=" + id +
                ", widgetName='" + widgetName + '\'' +
                ", widgetPurpose='" + widgetPurpose + '\'' +
                ", distributor='" + distributor + '\'' +
                ", price=" + price +
                '}';
    }
}
