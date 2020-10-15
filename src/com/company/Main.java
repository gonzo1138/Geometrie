package com.company;
/*
Shape (abstract) -> Circle, Trinagle, Rectangle
Methoden (abstract): Umfang, Flächeninhalt
Felder: Name, Form, Farbe, Radius / Kantenlängen

Main:
- mehrere Figuren erzeugen (Kreise, gleichschenklige, rechtwinklige Dreiecke, Rechtecke) und in Array speichern
- for-Schleife: Name, Farbe, Form, Umfang und Flächeninhlat ausgeben
 */

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        c1.setFormat("C1","circle  ", "red ");
        Circle c2 = new Circle(19);
        c2.setFormat("C2","circle  ", "green");
        Circle c3 = new Circle(42);
        c3.setFormat("C3","circle  ", "blue");

        Rectangle r1 = new Rectangle(12,13);
        r1.setFormat("R1", "rectangle", "magenta");
        Rectangle r2 = new Rectangle(14,15);
        r2.setFormat("R2", "rectangle", "cyan");
        Rectangle r3 = new Rectangle(16,17);
        r3.setFormat("R3", "rectangle", "yellow");

        Trinagle t1 = new Trinagle(2,2,3);
        t1.setFormat("T1", "triangle", "orange");
        Trinagle t2 = new Trinagle(5,5,6);
        t2.setFormat("T2", "triangle", "spring");
        Trinagle t3 = new Trinagle(8,8,9);
        t3.setFormat("T3", "triangle", "violet");

        Shape[] figures = {c1,c2,c3,r1,r2,r3,t1,t2,t3};

        System.out.println("\tcolor\tform\t\tperimeter\tacreage");
        for (int i=0; i<figures.length; i++){
            System.out.println(figures[i]);
        }
    }
}rose
