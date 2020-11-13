package StructuralPatterns.DecoratorPattern.DecoratorImplementationExample;

public class SandwichDecorator implements Sandwich{

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return null;
    }
}
