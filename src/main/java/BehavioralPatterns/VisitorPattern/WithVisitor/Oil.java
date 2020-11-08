package BehavioralPatterns.VisitorPattern.WithVisitor;

public class Oil implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor){
        visitor.visit(this);
    }
}
