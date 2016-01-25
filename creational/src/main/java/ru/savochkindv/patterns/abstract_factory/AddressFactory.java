package ru.savochkindv.patterns.abstract_factory;

/**
 * Интерфейс, описывающий фабричные методы
 * Created by savochkindv on 25.01.2016.
 */
public interface AddressFactory {

    /**
     * Создает адрес
     *
     * @return адрес
     */
    Address createAddress();

    /**
     * Создает номер телефона
     *
     * @return номер телефона
     */
    PhoneNumber createPhoneNumber();
}
