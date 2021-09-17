package pattern.kapitel2observer;

import java.util.Random;

public class StartObserver {
    public static void main(String[] args) throws InterruptedException {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        for (;;) {
            weatherData.setMeasurements(
                    50 + new Random().nextInt(30)
                    , 55 + new Random().nextInt(25)
                    , 30.4f + + new Random().nextInt(10));

            Thread.sleep( + new Random().nextInt(2000));

        }

    }
}

