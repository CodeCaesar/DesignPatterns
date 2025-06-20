package JavaDP.StrategyDesignPattern;

public class RobotCat extends Felidae {

    public RobotCat() {
        this.noiceBehaviour = new MeowNoice();
        this.swimBehaviour = new CantSwim();
    }
}
