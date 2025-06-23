package JavaDP.StateDesignPattern;

public class RedLight implements TrafficLightState {

    private Colours colour;

    public RedLight() {
        this.colour = Colours.RED;
    }

    public TrafficLightState nextState() {
        return new RedAmberLight();
    }
}
