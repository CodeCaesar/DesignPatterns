package JavaDP.StateDesignPattern;

public class GreenLight implements TrafficLightState {

    public GreenLight() {}
    
    public TrafficLightState nextState() {
        System.out.println("The light is GREEN");
        return new AmberLight();
    }
}
