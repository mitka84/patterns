package ru.savochkindv.patterns.messenger;

/**
 * Класс, описывающий вектор
 * Created by savochkindv on 18.01.2016.
 */
public class Vector {

    public int magnitude, direction;

    /**
     * Конструктор
     * @param magnitude величина
     * @param direction направление
     */
    public Vector ( int magnitude, int direction ) {
        this .magnitude = magnitude;
        this .direction = direction;
    }

}
