package JavaDP.FactoryDesignPattern;

public class FactoryMain {
    
    public static void main(String[] args) {
        CarStore carStore = new CarStore(new CarFactory());

        carStore.orderCar("BMW");
    }
}
