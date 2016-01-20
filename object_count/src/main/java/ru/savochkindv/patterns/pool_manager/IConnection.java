package ru.savochkindv.patterns.pool_manager;

/**
 * Интерфейс, описывающий соединение
 * Created by savochkindv on 20.01.2016.
 */
public interface IConnection {

    /**
     * Возвращает объект
     *
     * @return объект
     */
    Object get();

    /**
     * Устанавливает объект
     *
     * @param x объект
     */
    void set(Object x);
}
