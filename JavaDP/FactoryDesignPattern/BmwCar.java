package JavaDP.FactoryDesignPattern;

public class BmwCar extends Car {
    
    public BmwCar() {
        this.name = "BMW";
        this.priceRange[0] = 32_000;
        this.priceRange[1] = 150_000;
    }
}
