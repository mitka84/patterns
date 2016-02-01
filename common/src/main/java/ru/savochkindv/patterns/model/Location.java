package ru.savochkindv.patterns.model;

/**
 * Класс, описывающий местоположение
 * Created by savochkindv on 26.01.2016.
 */
public class Location {

    /**
     * Местоположение
     */
    private String location;

    /**
     * Конструктор
     *
     * @param location местоположение
     */
    public Location(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
