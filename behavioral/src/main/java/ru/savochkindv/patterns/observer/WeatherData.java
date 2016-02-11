package ru.savochkindv.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, реализующий изменения погода
 *
 * @author savochkindv
 *         Date: 11.02.2016.
 */
public class WeatherData implements Observable {

    /**
     * Список наблюдателей
     */
    private List<Observer> observers;

    /**
     * Температура
     */
    private float temperature;

    /**
     * Влажность
     */
    private float humidity;

    /**
     * Давление
     */
    private float pressure;

    /**
     * Конструктор
     */
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Устанавливает новые погодные данные
     *
     * @param temperature температура
     * @param humidity    влажность
     * @param pressure    давление
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
