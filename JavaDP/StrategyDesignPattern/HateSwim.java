package JavaDP.StrategyDesignPattern;

public class HateSwim implements SwimBehaviour {
    
    @Override
    public void swim() {
        System.out.println("* hates to swim*");
    }
}
