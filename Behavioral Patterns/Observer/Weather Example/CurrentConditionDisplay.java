import observers.WeatherObserver;
import subjects.WeatherSubject;

public class CurrentConditionDisplay implements WeatherObserver, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherSubject weatherData;

    public CurrentConditionDisplay(WeatherSubject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees / " + humidity +" %humidity / "+ pressure + " pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
