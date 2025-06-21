package JavaDP.DecoratorDesignPattern;

public class VanillaIceCream extends IceCreamDecorator {
    
    private IceCream iceCream;

    public VanillaIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", vanilla ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 0.99;
    }
}
