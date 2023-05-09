package Decorator;

public class Draw {

    public static void main(String[] args) {

        Shape circle = new Shape.Circle();

        Shape redCircle = new RedShapeDecorator(new Shape.Circle());
        Shape redRectangle = new RedShapeDecorator(new Shape.Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }

}
