package JavaDP.DecoratorDesignPattern;

public abstract class IceCream {
    String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}