package ru.savochkindv.patterns.command;

import ru.savochkindv.patterns.model.Location;

/**
 * Интерфейс, описывающий редактор местоположения
 * Created by savochkindv on 01.02.2016.
 */
public interface ILocationEditor {

    /**
     * Возвращает новое местоположение
     *
     * @return новое местоположение
     */
    Location getNewLocation();

}
