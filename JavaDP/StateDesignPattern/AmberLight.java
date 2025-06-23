package JavaDP.StateDesignPattern;

public class AmberLight implements TrafficLightState {
    
    private Colours colour;

    public AmberLight() {
        this.colour = Colours.AMBER;
    }
    
    public TrafficLightState nextState() {
        return new RedLight();
    }
}
