package JavaDP.DecoratorDesignPattern;

public class CaramelIceCream extends IceCreamDecorator {
    
    private IceCream iceCream;

    public CaramelIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", caramel ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 1.49;
    }
}
