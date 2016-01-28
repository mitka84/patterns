package ru.savochkindv.patterns.prototype;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Класс, описывающий адресс
 * Created by savochkindv on 28.01.2016.
 */
public class Address implements ICopyable<Address> {

    /**
     * Тип адреса
     */
    private AddressType type;

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

    /**
     * Конструктор
     *
     * @param type    тип адреса
     * @param street  улица
     * @param city    город
     * @param state   штат
     * @param zipCode индекс
     */
    public Address(AddressType type, String street, String city, String state, String zipCode) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Конструктор. Тип адреса "Рабочий" проставляется по умолчанию
     *
     * @param street  улица
     * @param city    город
     * @param state   штат
     * @param zipCode индекс
     */
    public Address(String street, String city, String state, String zipCode) {
        this.type = AddressType.WORK;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public Address copy() {
        return new Address(street, city, state, zipCode);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
