public class RedLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight tl) {
        System.out.println("Traffic Light is RED. Cars must stop.");
        tl.setState(new YellowLightState()); // Transition to Yellow Light
    }
}
