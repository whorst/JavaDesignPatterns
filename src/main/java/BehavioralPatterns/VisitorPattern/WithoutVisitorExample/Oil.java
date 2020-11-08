package BehavioralPatterns.VisitorPattern.WithoutVisitorExample;

public class Oil implements AtvPart{
    @Override
    public double calculateShipping() {
        return 9;
    }
}
