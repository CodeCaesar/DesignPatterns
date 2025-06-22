package JavaDP.FactoryDesignPattern;

public class HondaCar extends Car {
    
    public HondaCar() {
        this.name = "Honda";
        this.priceRange[0] = 25_000;
        this.priceRange[1] = 50_000;
    }
}
