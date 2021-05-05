package Shapes;

public class Rectangle {
    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double  getPerimeter(){
        return (this.width * 2) + (this.length *2);
    }

    public double getArea(){
        return (this.width) * (this.length);
    }
}