package JavaDP.AbstractFactoryDesignPattern;

public class Car {
    
    private String name;
    private int[] priceRange = new int[2];
    private CarType type;
    private String fullName;

    public Car(String name, CarType type, int[] priceRange) {
        this.name = name;
        this.type = type;
        this.priceRange = priceRange;
        this.fullName = name + " " + type.getType();
    }

    public void build() {
        System.out.println(fullName + " is being build...");
    }

    public void ship() {
        System.out.println(fullName + " is being shipped...");
    }

    public void info() {
        System.out.println(fullName + " has arrived...\n\nInfo:");
        System.out.println("Name: " + fullName + "\nPrice Range: from £" + priceRange[0] + " to £" + priceRange[1]);
    }
}
