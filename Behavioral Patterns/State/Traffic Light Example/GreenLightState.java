public class GreenLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight tl) {
        System.out.println("Traffic Light is GREEN. Person must stop.");
        tl.setState(new YellowLightState()); // Transition to Yellow Light
    }
}
