package JavaDP.DecoratorDesignPattern;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", chocolate ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 1.49;
    }
}
