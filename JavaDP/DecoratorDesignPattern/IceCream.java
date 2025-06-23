package JavaDP.DecoratorDesignPattern;

public abstract class IceCream {
    
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}