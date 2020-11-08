package BehavioralPatterns.VisitorPattern.WithVisitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
