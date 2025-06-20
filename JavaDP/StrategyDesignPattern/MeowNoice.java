package JavaDP.StrategyDesignPattern;

public class MeowNoice implements NoiceBehaviour {
    
    @Override
    public void noice(String name) {
        System.out.println("name: *MEOW*");
    }
}
