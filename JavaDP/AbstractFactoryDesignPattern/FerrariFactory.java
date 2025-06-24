package JavaDP.AbstractFactoryDesignPattern;

public class FerrariFactory extends AbstractCarFactory {
    
    @Override
    public Car createCar(String type) {
        Car car = null;
        String name = "Ferrari";

        if(type.equals("SUV")) {
            int[] priceRange = {1,6};
            car = new Car(name, new SuvCarType(), priceRange);
        } else if(type.equals("Super")) {
            int[] priceRange = {1,6};
            car = new Car(name, new SuperCarType(), priceRange);
        }

        return car;
    }
}
