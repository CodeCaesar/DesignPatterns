package JavaDP.DecoratorDesignPattern;

public class IceCreamCup extends IceCream {

    public IceCreamCup() {
        this.description = "ice-cream cup";
    }

    public double cost() {
        return 0.05;
    }
}
