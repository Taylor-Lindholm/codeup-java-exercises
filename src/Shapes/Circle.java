package Shapes;

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
        System.out.println("Creating a circle with the radius of " + radius);
    }

    public double getCircum() {
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
