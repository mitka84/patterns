package ru.savochkindv.patterns.abstract_factory;

/**
 * Интерфейс, описывающий фабричные методы
 * Created by savochkindv on 25.01.2016.
 */
public interface IAddressFactory {

    /**
     * Создает адрес
     *
     * @return адрес
     */
    AbstractAddress createAddress();

    /**
     * Создает номер телефона
     *
     * @return номер телефона
     */
    AbstractPhoneNumber createPhoneNumber();
}
