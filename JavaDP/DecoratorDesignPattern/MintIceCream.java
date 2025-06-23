package JavaDP.DecoratorDesignPattern;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", mint ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 1.99;
    }
}
