package JavaDP.FactoryDesignPattern;

public class ToyotaCar extends Car {
    
    public ToyotaCar() {
        this.name = "Toyota";
        this.priceRange[0] = 16_000;
        this.priceRange[1] = 77_000;
    }
}
