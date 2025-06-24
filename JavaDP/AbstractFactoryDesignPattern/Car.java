package JavaDP.AbstractFactoryDesignPattern;

public abstract class Car {
    
    private String name;
    private int[] priceRange = new int[2];
    private CarType type;

    public Car(CarType type, int[] priceRange) {
        this.type = type;
        this.priceRange = priceRange;
    }

    public void build() {
        System.out.println(name + " is being build...");
    }

    public void ship() {
        System.out.println(name + " is being shipped...");
    }

    public void info() {
        System.out.println(name + " has arrived...\n\nInfo:");
        System.out.println("Name: " + name + "\nPrice Range: from £" + priceRange[0] + " to £" + priceRange[1]);
    }
}
