package JavaDP.FactoryDesignPattern;

public class AudiCar extends Car {
    
    public AudiCar() {
        this.name = "Audi";
        this.priceRange[0] = 24_000;
        this.priceRange[1] = 140_000;
    }
}
