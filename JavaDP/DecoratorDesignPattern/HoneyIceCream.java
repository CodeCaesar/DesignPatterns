package JavaDP.DecoratorDesignPattern;

public class HoneyIceCream extends IceCreamDecorator {
    
    private IceCream iceCream;

    public HoneyIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", honey ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 2.49;
    }
}
