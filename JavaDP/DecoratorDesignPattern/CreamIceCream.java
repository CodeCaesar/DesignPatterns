package JavaDP.DecoratorDesignPattern;

public class CreamIceCream extends IceCreamDecorator {
    
    private IceCream iceCream;

    public CreamIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", cream ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 0.99;
    }
}
