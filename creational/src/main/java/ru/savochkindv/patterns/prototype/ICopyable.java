package ru.savochkindv.patterns.prototype;

/**
 * Интерфейс, описывающий объекты, способные получать прототипы
 * Created by savochkindv on 28.01.2016.
 */
public interface ICopyable<T> {

    /**
     * Возвращает прототип объекта
     *
     * @return прототип объекта
     */
    T copy();
}
