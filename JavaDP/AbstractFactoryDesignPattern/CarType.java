package JavaDP.AbstractFactoryDesignPattern;

public abstract class CarType {
    
    protected String name;
    protected int[] priceRange = new int[2];

    public CarType() {}

    public void setPriceRange(int[] newPriceRange) {
        this.priceRange = newPriceRange;
    }
}
