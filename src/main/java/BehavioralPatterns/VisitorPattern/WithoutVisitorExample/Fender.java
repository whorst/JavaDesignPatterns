package BehavioralPatterns.VisitorPattern.WithoutVisitorExample;

public class Fender implements AtvPart{
    @Override
    public double calculateShipping() {
        return 3;
    }
}
