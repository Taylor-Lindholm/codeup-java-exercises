package Shapes;

import Util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle.");
        double radius = Input.getDouble();
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumfrence = circle.getCircum();
        System.out.printf("A circle with a radius of %f has a circumference of %f and an area of %f", radius, circumfrence, area);
    }
}
