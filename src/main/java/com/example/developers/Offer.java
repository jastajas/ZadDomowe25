package com.example.developers;

import javax.persistence.*;
@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double area;
    private byte floorNo;
    private byte roomsNo;
    private String layoutURL;
    private double price;
    private String description;
    private boolean promoted;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Investment investment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public byte getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(byte floorNo) {
        this.floorNo = floorNo;
    }

    public byte getRoomsNo() {
        return roomsNo;
    }

    public void setRoomsNo(byte roomsNo) {
        this.roomsNo = roomsNo;
    }

    public String getLayoutURL() {
        return layoutURL;
    }

    public void setLayoutURL(String layoutURL) {
        this.layoutURL = layoutURL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }
}
