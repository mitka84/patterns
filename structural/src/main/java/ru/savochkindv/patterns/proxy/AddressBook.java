package ru.savochkindv.patterns.proxy;

import ru.savochkindv.patterns.model.interfaces.IAddress;

import java.util.List;

/**
 * Класс, описывающий
 *
 * @author savochkindv
 *         Date 25.04.2016.
 */
public interface AddressBook {

    /**
     * Добавляет адрес
     *
     * @param address адрес
     */
    void add(IAddress address);

    /**
     * Возвращает все адреса
     *
     * @return список адресов
     */
    List<IAddress> getAllAddresses();

    /**
     * Возвращает адрес по описанию
     *
     * @param description описание
     * @return адрес
     */
    IAddress getAddress(String description);

    /**
     * Открыть
     */
    void open();

    /**
     * Сохранить
     */
    void save();
}
