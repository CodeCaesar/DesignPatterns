package JavaDP.StateDesignPattern;

public class GreenLight implements TrafficLightState {
    
    private Colours colour;

    public GreenLight() {
        this.colour = Colours.GREEN;
    }
    
    public TrafficLightState nextState() {
        return new AmberLight();
    }
}
