package JavaDP.StateDesignPattern;

public class StateMain {
    
    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();

        trafficLights.doRounds(5);
    }
}
