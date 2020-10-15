package com.company;

public abstract class Shape {

    double x;
    double y;

    String name;
    String form;
    String color;

    public void setDimensions(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setFormat(String name, String form, String color){
        this.name = name;
        this.form = form;
        this.color = color;
    }

    double perimeter() {
        return 2*x + 2*y;
    }

    double acreage() {
        return x*y;
    }

    @Override
    public String toString(){
        return name + "\t" + color + "\t" + form + "\t" + String.format("%.2f",  perimeter()) + "\t" + String.format("%.2f", acreage());
    }
}