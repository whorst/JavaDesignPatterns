package StructuralPatterns.BridgePattern.ShapeWithBridgeExample;

public class ShapeTwoBridgeDemo {

    public static void main(String args[]) {
        Color red = new Red();
        Color blue = new Blue();

        Shape circle = new Circle(red);
        Square square = new Square(blue);

        circle.applyColor();
        square.applyColor();
    }
}
