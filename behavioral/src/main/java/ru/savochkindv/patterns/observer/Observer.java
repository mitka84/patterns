package ru.savochkindv.patterns.observer;

/**
 * Интерфейс, с помощью которого наблюдатель получает оповещение
 *
 * @author savochkindv
 *         Date: 11.02.2016.
 */
public interface Observer {

    /**
     * Изменение данных
     *
     * @param temperature температура
     * @param humidity    влажность
     * @param pressure    давление
     */
    void update(float temperature, float humidity, float pressure);
}
