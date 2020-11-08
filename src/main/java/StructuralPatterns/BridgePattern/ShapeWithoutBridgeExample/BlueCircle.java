package StructuralPatterns.BridgePattern.ShapeWithoutBridgeExample;

public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}
