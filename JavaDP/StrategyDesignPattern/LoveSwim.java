package JavaDP.StrategyDesignPattern;

public class LoveSwim implements SwimBehaviour {
    
    @Override
    public void swim(String name) {
        System.out.println("*" + name + " swims*");
    }
}
