package JavaDP.StrategyDesignPattern;

public class RoarNoice implements NoiceBehaviour {
    
    @Override
    public void noice(String name) {
        System.out.println("name: *ROAR*");
    }
}
