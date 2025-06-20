package JavaDP.StrategyDesignPattern;

public class HouseCat extends Felidae{
    
    public HouseCat() {
        this.noiceBehaviour = new MeowNoice();
        this.swimBehaviour = new HateSwim();
    }
}
