public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate the traffic light changing states
        trafficLight.request(); // RED -> YELLOW
        trafficLight.request(); // YELLOW -> GREEN
        trafficLight.request(); // GREEN -> YELLOW
        trafficLight.request(); // YELLOW -> RED
        trafficLight.request(); // RED -> GREEN
        trafficLight.request(); // RED -> GREEN

    }
}
