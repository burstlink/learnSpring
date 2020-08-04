package com.leeyy.bean;

public class Car {
    private String carNamn;
    private Integer price;
    private String color;

    public String getCarNamn() {
        return carNamn;
    }

    public void setCarNamn(String carNamn) {
        this.carNamn = carNamn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNamn='" + carNamn + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
