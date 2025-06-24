package JavaDP.AbstractFactoryDesignPattern;

public abstract class Car {
    
    protected String name;
    protected int[] priceRange = new int[2];

    public Car() {}

    public void setPriceRange(int[] newPriceRange) {
        this.priceRange = newPriceRange;
    }
}
