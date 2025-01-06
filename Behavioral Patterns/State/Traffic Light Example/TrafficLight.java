public class TrafficLight {
    public TrafficLightState state;

    public TrafficLight() {
        state = new RedLightState();
    }
    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}
