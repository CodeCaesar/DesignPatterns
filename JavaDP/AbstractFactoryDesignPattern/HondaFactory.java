package JavaDP.AbstractFactoryDesignPattern;

public class HondaFactory extends AbstractCarFactory {
    
    @Override
    public Car createCar(String type) {
        Car car = null;
        String name = "Honda";

        if(type.equals("SUV")) {
            int[] priceRange = {30_400, 41_825};
            car = new Car(name, new SuvCarType(), priceRange);
        } else if(type.equals("Sedan")) {
            int[] priceRange = {15_000, 25_000};
            car = new Car(name, new SedanCarType(), priceRange);
        } else if(type.equals("Electric")) {
            int[] priceRange = {37_405, 44_995};
            car = new Car(name, new ElectricCarType(), priceRange);
        }

        return car;
    }
}
