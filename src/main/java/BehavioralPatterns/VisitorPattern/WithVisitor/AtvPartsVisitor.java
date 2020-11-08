package BehavioralPatterns.VisitorPattern.WithVisitor;

import java.util.List;

public class AtvPartsVisitor implements AtvPartVisitor {
    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("fender are bulky and expensive to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 4;
        System.out.println("oil are bulky and expensive to ship");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 things they get a discount");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
