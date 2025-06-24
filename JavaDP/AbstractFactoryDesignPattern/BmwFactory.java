package JavaDP.AbstractFactoryDesignPattern;

public class BmwFactory extends AbstractCarFactory {

    @Override
    public Car createCar(String type) {
        Car car = null;
        String name = "BMW";

        if(type.equals("SUV")) {
            int[] priceRange = {1,6};
            car = new Car(name, new SuvCarType(), priceRange);
        } else if(type.equals("Sedan")) {
            int[] priceRange = {1,6};
            car = new Car(name, new SedanCarType(), priceRange);
        } else if(type.equals("Hybrid")) {
            int[] priceRange = {1,6};
            car = new Car(name, new HybridCarType(), priceRange);
        } else if(type.equals("Electric")) {
            int[] priceRange = {1,6};
            car = new Car(name, new ElectricCarType(), priceRange);
        }

        return car;
    }
}
