package JavaDP.DecoratorDesignPattern;

public class IceCreamCone extends IceCream {
    
    public IceCreamCone() {
        this.description = "ice-cream cone";
    }

    public double cost() {
        return 0.15;
    }
}
