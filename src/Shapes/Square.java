package Shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side,side);
    }


    public int getPerimeter() {
        return this.length * 4;
    }


    public int getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
