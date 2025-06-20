package JavaDP.StrategyDesignPattern;

public class CantSwim implements SwimBehaviour {
    
    @Override
    public void swim(String name) {
        System.out.println("*" + name + " sinks*");
    }
}
