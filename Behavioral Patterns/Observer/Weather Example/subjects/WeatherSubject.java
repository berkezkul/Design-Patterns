package subjects;

import observers.WeatherObserver;

public interface WeatherSubject {

    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();
}
