package JavaDP.AbstractFactoryDesignPattern;

public class Car {
    
    private String name;
    private int[] priceRange = new int[2];
    private CarType type;

    public Car(String name, CarType type, int[] priceRange) {
        this.name = name;
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
        System.out.println(name + ": " + type.getType() + " has arrived...\n\nInfo:");
        System.out.println("Name: " + name + "\nPrice Range: from £" + priceRange[0] + " to £" + priceRange[1]);
    }
}
