package JavaDP.FactoryDesignPattern;

public abstract class Car {
    
    protected String name;
    protected int[] priceRange = new int[2];

    public Car() {}

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
