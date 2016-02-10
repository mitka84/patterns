package ru.savochkindv.patterns.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ru.savochkindv.patterns.model.enums.AddressType;
import ru.savochkindv.patterns.model.interfaces.IAddress;

/**
 * Класс, реализующий базовый адрес
 * Created by savochkindv on 10.02.2016.
 */
public class AddressImpl implements IAddress {

    /**
     * Тип адреса
     */
    private AddressType type;

    /**
     * Описание
     */
    private String description;

    /**
     * Улица
     */
    private String street;

    /**
     * Город
     */
    private String city;

    /**
     * Штат
     */
    private String state;

    /**
     * Индекс
     */
    private String zipCode;

    @Override
    public AddressType getType() {
        return type;
    }

    @Override
    public void setType(AddressType type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }

    @Override
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
