package ru.savochkindv.patterns.observer;

/**
 * @author savochkindv
 *         Date: 11.02.2016.
 */
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Сейчас значения: %.1f градусов цельсия и %.1f %% влажности\n", temperature, humidity);
    }

}
