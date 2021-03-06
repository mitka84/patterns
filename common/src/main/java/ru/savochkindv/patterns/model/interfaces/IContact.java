package ru.savochkindv.patterns.model.interfaces;

/**
 * Интерфейс описывающий контаакт
 * Created by savochkindv on 31.01.2016.
 */
public interface IContact {

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getTitle();

    void setTitle(String title);

    String getOrganization();

    void setOrganization(String organization);

    IAddress getAddress();

    void setAddress(IAddress address);

}
