package BehavioralPatterns.VisitorPattern.WithoutVisitorExample;

public class Wheel implements AtvPart{
    @Override
    public double calculateShipping() {
        return 12;
    }
}
