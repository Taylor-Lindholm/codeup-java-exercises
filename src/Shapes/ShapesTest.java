package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle boxOne = new Rectangle(4,5);

        System.out.println(boxOne.getArea());
        System.out.println(boxOne.getPerimeter());

        Square squareOne = new Square(5);

        System.out.println(squareOne.getArea());
        System.out.println(squareOne.getPerimeter());

        Measurable myShape;
        myShape = new Square(25);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(25, 10);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}
