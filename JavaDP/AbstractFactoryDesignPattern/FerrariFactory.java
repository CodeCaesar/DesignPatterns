package JavaDP.AbstractFactoryDesignPattern;

public class FerrariFactory extends AbstractCarFactory {
    
    @Override
    public Car createCar(String type) {
        Car car = null;

        if(type.equals("SUV")) {
            int[] priceRange = {1,6};
            car = new Car(new SuvCarType(), priceRange);
        } else if(type.equals("Super")) {
            int[] priceRange = {1,6};
            car = new Car(new SuperCarType(), priceRange);
        }

        return car;
    }
}
