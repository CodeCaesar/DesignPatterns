package JavaDP.StateDesignPattern;

public class TrafficLights {
    
    private TrafficLightState state;

    public TrafficLights() {
        this.state = new RedLight();
    }

    public void doRounds(int rounds) {
        for(int round = 0; round < rounds; round++) {
            state = state.nextState();
        }
    }
}
