package JavaDP.StateDesignPattern;

public class AmberLight implements TrafficLightState {
    
    public AmberLight() {}
    
    public TrafficLightState nextState() {
        System.out.println("The light is AMBER");
        return new RedLight();
    }
}
