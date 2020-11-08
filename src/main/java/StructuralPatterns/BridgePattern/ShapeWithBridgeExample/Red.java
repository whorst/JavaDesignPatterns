package StructuralPatterns.BridgePattern.ShapeWithBridgeExample;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}
