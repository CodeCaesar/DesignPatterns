package JavaDP.AbstractFactoryDesignPattern;

public class BmwFactory extends AbstractCarFactory {

    @Override
    public Car createCar(String type) {
        Car car = null;
        String name = "BMW";

        if(type.equals("SUV")) {
            int[] priceRange = {34_365, 144_660};
            car = new Car(name, new SuvCarType(), priceRange);
        } else if(type.equals("Sedan")) {
            int[] priceRange = {41_310, 111_605};
            car = new Car(name, new SedanCarType(), priceRange);
        } else if(type.equals("Hybrid")) {
            int[] priceRange = {39_000, 111_605};
            car = new Car(name, new HybridCarType(), priceRange);
        } else if(type.equals("Electric")) {
            int[] priceRange = {43_305, 164_420};
            car = new Car(name, new ElectricCarType(), priceRange);
        }

        return car;
    }
}
