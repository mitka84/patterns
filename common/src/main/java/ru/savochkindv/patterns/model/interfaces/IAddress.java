package ru.savochkindv.patterns.model.interfaces;

import ru.savochkindv.patterns.model.enums.AddressType;

/**
 * Интерфейс, описывающий адресс
 * Created by savochkindv on 10.02.2016.
 */
public interface IAddress {

    AddressType getType();

    void setType(AddressType type);

    String getDescription();

    void setDescription(String description);

    String getStreet();

    void setStreet(String street);

    String getCity();

    void setCity(String city);

    String getState();

    void setState(String state);

    String getZipCode();

    void setZipCode(String zipCode);
}
