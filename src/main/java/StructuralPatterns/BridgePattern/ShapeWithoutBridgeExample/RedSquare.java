package StructuralPatterns.BridgePattern.ShapeWithoutBridgeExample;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}
