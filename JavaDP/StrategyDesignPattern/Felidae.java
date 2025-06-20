package JavaDP.StrategyDesignPattern;

public abstract class Felidae {

    protected String name;
    protected NoiceBehaviour noiceBehaviour;
    protected SwimBehaviour swimBehaviour;

    public Felidae() {
    }

    public void noice() {
        noiceBehaviour.noice(name);
    }

    public void swim() {
        swimBehaviour.swim(name);
    }
}