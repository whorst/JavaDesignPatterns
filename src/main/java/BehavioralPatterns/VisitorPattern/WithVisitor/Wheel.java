package BehavioralPatterns.VisitorPattern.WithVisitor;

public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor){
        visitor.visit(this);
    }

}
