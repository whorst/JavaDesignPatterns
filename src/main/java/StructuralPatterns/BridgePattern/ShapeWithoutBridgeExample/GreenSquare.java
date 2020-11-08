package StructuralPatterns.BridgePattern.ShapeWithoutBridgeExample;

public class GreenSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
