package JavaDP.FactoryDesignPattern;

public class CarFactory {
    
    public Car createCar(String type) {
        Car car = null;

        if(type.equals("Audi")) {
            car = new AudiCar();
        } else if(type.equals("BMW")) {
            car = new BmwCar();
        } else if(type.equals("Ferrari")) {
            car = new FerrariCar();
        } else if(type.equals("Honda")) {
            car = new HondaCar();
        } else if(type.equals("Lamborghini") || type.equals("Lambo")) {
            car = new LamborghiniCar();
        } else if(type.equals("Pagani")) {
            car = new PaganiCar();
        } else if(type.equals("Toyota")) {
            car = new ToyotaCar();
        }

        return car;
    }
}
