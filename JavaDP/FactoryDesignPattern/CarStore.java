package JavaDP.FactoryDesignPattern;

public class CarStore {
    
    private CarFactory carFactory;

    public CarStore(CarFactory carFactory) {
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
