package JavaDP.AbstractFactoryDesignPattern;

public abstract class Car {
    
    private String name;
    private int[] priceRange = new int[2];
    private CarType type;

    public Car(CarType type, int[] priceRange) {
        this.type = type;
        this.priceRange = priceRange;
    }

    public void setPriceRange(int[] newPriceRange) {
        this.priceRange = newPriceRange;
    }
}
