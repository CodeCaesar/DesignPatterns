package JavaDP.DecoratorDesignPattern;

public class IceCreamCone extends IceCream {
    
    public IceCreamCone() {
        this.description = "Ice-cream cone";
    }

    public double cost() {
        return 0.15;
    }
}
