package JavaDP.AbstractFactoryDesignPattern;

public class CarStore {
    
    private AbstractCarFactory carFactory;

    public CarStore(AbstractCarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(String type) {
        Car car;

        car = carFactory.createCar(type);

        car.build();
        car.ship();
        car.info();

        return car;
    }
}
