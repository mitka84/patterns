package ru.savochkindv.patterns.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
     * Конструктор
     * @param firstName    имя
     * @param lastName     фамилия
     * @param title        заголовок
     * @param organization организация
     */
    public ContactImpl(String firstName, String lastName, String title, String organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.organization = organization;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
