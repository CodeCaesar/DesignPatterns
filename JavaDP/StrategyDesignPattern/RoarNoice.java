package JavaDP.StrategyDesignPattern;

public class RoarNoice implements NoiceBehaviour {
    
    @Override
    public void noice() {
        System.out.println("*ROAR*");
    }
}
