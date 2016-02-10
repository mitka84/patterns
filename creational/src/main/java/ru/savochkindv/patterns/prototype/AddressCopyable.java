package ru.savochkindv.patterns.prototype;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ru.savochkindv.patterns.model.enums.AddressType;
import ru.savochkindv.patterns.model.interfaces.IAddress;

/**
 * Класс, описывающий адресс
 * Created by savochkindv on 28.01.2016.
 */
public class AddressCopyable implements ICopyable<IAddress>, IAddress {

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
     * Описание
     */
    private String description;

    /**
     * Конструктор
     *
     * @param type          тип адреса
     * @param street        улица
     * @param city          город
     * @param state         штат
     * @param zipCode       индекс
     * @param description   описание
     */
    public AddressCopyable(AddressType type, String street, String city, String state, String zipCode, String description) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.description = description;
    }

    /**
     * Конструктор. Тип адреса "Рабочий" проставляется по умолчанию
     *
     * @param street        улица
     * @param city          город
     * @param state         штат
     * @param zipCode       индекс
     * @param description   описание
     */
    public AddressCopyable(String street, String city, String state, String zipCode, String description) {
        this.type = AddressType.WORK;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.description = description;
    }

    @Override
    public AddressType getType() {
        return type;
    }

    @Override
    public void setType(AddressType type) {
        this.type = type;
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
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public IAddress copy() {
        return new AddressCopyable(street, city, state, zipCode, description);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
