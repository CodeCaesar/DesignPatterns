package JavaDP.StrategyDesignPattern;

public class Lion extends Felidae {
    
    public Lion() {
        this.noiceBehaviour = new RoarNoice();
        this.swimBehaviour = new HateSwim();
    }
}
