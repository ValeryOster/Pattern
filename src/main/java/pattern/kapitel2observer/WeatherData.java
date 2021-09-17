package pattern.kapitel2observer;

import java.util.ArrayList;

public class WeatherData  implements pattern.kapitel2observer.Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> ((Observer)o).update(temperature,humidity,pressure));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)  {
        this.temperature = temperature;

        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
