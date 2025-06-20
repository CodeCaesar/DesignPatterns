package JavaDP.StrategyDesignPattern;

public class Tiger extends Felidae {
    
    public Tiger() {
        this.noiceBehaviour = new RoarNoice();
        this.swimBehaviour = new LoveSwim();
    }
}
