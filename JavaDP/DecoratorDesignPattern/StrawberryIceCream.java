package JavaDP.DecoratorDesignPattern;

public class StrawberryIceCream {

    private IceCream iceCream;

    public StrawberryIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", strawberry ice-cream";
    }

    public double cost() {
        return iceCream.cost() + 1.49;
    }
}
