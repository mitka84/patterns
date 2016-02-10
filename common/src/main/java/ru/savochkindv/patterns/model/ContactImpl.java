package ru.savochkindv.patterns.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ru.savochkindv.patterns.model.interfaces.IAddress;
import ru.savochkindv.patterns.model.interfaces.IContact;

/**
 * Класс, описывающий базовую реализацию контакта
 * Created by savochkindv on 31.01.2016.
 */
public class ContactImpl implements IContact {

    /**
     * Имя
     */
    private String firstName;

    /**
     * Фамилия
     */
    private String lastName;

    /**
     * Заголовок
     */
    private String title;

    /**
     * Организация
     */
    private String organization;

    /**
     * Адрес
     */
    private IAddress address;

    /**
     * Конструктор
     * @param firstName    имя
     * @param lastName     фамилия
     * @param title        заголовок
     * @param organization организация
     * @param address      адрес
     */
    public ContactImpl(String firstName, String lastName, String title, String organization, IAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.organization = organization;
        this.address = address;
    }

    /**
     * Конструктор
     */
    public ContactImpl() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getOrganization() {
        return organization;
    }

    @Override
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public IAddress getAddress() {
        return address;
    }

    @Override
    public void setAddress(IAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
