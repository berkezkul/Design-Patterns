public class YellowLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight tl) {
        System.out.println("Traffic Light is YELLOW. Prepare to stop or proceed with caution.");
        tl.setState(new GreenLightState()); // Transition to Yellow Light
    }
}
