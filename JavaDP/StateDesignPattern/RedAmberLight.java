package JavaDP.StateDesignPattern;

public class RedAmberLight implements TrafficLightState {
    
    private Colours colour;

    public RedAmberLight() {
        this.colour = Colours.RED_AND_AMBER;
    }
    
    public TrafficLightState nextState() {
        return new GreenLight();
    }
}
