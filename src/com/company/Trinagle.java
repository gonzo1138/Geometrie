package com.company;

public class Trinagle extends Shape {

    double z;

    public Trinagle(){}

    public Trinagle(double a, double b, double c){
        this.x = a;
        this.y = b;
        this.z = c;
    }


    public void setDimensions(double a, double b, double c){
        this.x = a;
        this.y = b;
        this.z = c;
    }

    double perimeter() {
        return x+y+z;
    }

    double acreage() {
        double s = (x+y+z)/2;
        return Math.sqrt((s*(s-x)*(s-y)*(s-z)));
    }
}
