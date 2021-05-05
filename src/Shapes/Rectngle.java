package Shapes;

public class Rectngle {
    protected double length;
    protected double width;


    public Rectngle(double length, double width) {
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