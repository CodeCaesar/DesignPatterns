package JavaDP.AbstractFactoryDesignPattern;

public class HondaFactory extends AbstractCarFactory {
    
    @Override
    public Car createCar(String type) {
        Car car = null;

        if(type.equals("SUV")) {
            int[] priceRange = {1,6};
            car = new Car(new SuvCarType(), priceRange);
        } else if(type.equals("Sedan")) {
            int[] priceRange = {1,6};
            car = new Car(new SedanCarType(), priceRange);
        } else if(type.equals("Electric")) {
            int[] priceRange = {1,6};
            car = new Car(new ElectricCarType(), priceRange);
        }

        return car;
    }
}
