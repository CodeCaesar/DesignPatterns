package JavaDP.DecoratorDesignPattern;

public class DecoratorMain {
    
    public static void main(String[] args) {
        IceCreamCone cone = new IceCreamCone();

        VanillaIceCream vanilla = new VanillaIceCream(cone);
        StrawberryIceCream strawberry = new StrawberryIceCream(vanilla);
        ChocolateIceCream chocolate = new ChocolateIceCream(strawberry);
    }
}
