package JavaDP.StrategyDesignPattern;

public class HateSwim implements SwimBehaviour {
    
    @Override
    public void swim(String name) {
        System.out.println("* hates to swim*");
    }
}
