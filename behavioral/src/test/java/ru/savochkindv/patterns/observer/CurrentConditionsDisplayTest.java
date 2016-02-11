package ru.savochkindv.patterns.observer;

import org.junit.Test;

/**
 * @author savochkindv
 *         Date: 11.02.2016.
 */
public class CurrentConditionsDisplayTest {

    @Test
    public void testDisplay() throws Exception {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29, 65, 30.4f);
        weatherData.setMeasurements(39, 70, 29.4f);
        weatherData.setMeasurements(42, 72, 31.4f);
    }
}