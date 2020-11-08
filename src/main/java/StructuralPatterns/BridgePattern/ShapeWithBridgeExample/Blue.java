package StructuralPatterns.BridgePattern.ShapeWithBridgeExample;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}
