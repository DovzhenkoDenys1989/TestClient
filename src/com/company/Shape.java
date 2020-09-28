package com.company;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();


    public void showColorAndArea() {
        System.out.println(color + " " + area());
    }
}


