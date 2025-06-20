package JavaDP.StrategyDesignPattern;

public class FishingCat extends Felidae {
    
    public FishingCat() {
        this.noiceBehaviour = new MeowNoice();
        this.swimBehaviour = new LoveSwim();
    }
}
