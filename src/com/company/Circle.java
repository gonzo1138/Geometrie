package com.company;

public class Circle extends Shape {

    public Circle(){}

    public Circle(double radius){
        this.x = radius;
    }

    public void setDimensions(double radius) {
        this.x = radius;
    }

    double perimeter() {
        return 2 * Math.PI * x;
    }

    double acreage() {
        return Math.PI * x*x;
    }
}