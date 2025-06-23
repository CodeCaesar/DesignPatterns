package JavaDP.StateDesignPattern;

public class RedAmberLight implements TrafficLightState {

    public RedAmberLight() {}
    
    public TrafficLightState nextState() {
        System.out.println("The light is RED and AMBER");
        return new GreenLight();
    }
}
