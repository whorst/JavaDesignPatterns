package StructuralPatterns.BridgePattern.ShapeWithBridgeExample;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor(){
        color.applyColor();
    }
}
