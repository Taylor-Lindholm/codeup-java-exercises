package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);

    }

    public int  getPerimeter(){
        return (this.width * 2) + (this.length *2);
    }

    public int getArea(){
        return (this.width) * (this.length);
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
}