package JavaDP.AbstractFactoryDesignPattern;

public class BmwFactory extends AbstractCarFactory {

    @Override
    public Car createCar(String type) {
        Car car = null;

        if(type.equals("SUV")) {
            int[] priceRange = {1,6};
            car = new Car(new SuvCarType(), priceRange);
        }

        return car;
    }
}
