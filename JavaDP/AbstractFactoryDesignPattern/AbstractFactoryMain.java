package JavaDP.AbstractFactoryDesignPattern;

public class AbstractFactoryMain {
    
    public static void main(String[] args) {
        CarStore ferrariStore = new CarStore(new FerrariFactory());

        ferrariStore.orderCar("Super");
    }
}
