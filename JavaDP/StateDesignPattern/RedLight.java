package JavaDP.StateDesignPattern;

public class RedLight implements TrafficLightState {

    public RedLight() {}

    public TrafficLightState nextState() {
        System.out.println("The light is RED");
        return new RedAmberLight();
    }
}
