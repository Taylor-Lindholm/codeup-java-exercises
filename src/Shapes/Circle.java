package Shapes;

import java.util.Scanner;

public class Circle {
    private double radius(){
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    public Circle(double radius){
        System.out.println("Creating a circle with the radius of " + this.radius());
    }

    public double getCircum(double radius) {
        return 2 * Math.PI * radius;
    }
    public double getArea(double radius){
        return Math.PI * (radius * radius);
    }
}
