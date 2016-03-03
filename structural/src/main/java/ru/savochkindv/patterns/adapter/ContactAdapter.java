package ru.savochkindv.patterns.adapter;

import ru.savochkindv.patterns.model.interfaces.IAddress;
import ru.savochkindv.patterns.model.interfaces.IContact;

/**
 * Адаптер, преобразующий интерфейс на нетипичном языке в наш
 *
 * @author savochkindv
 *         Date: 03.03.2016.
 */
public class ContactAdapter implements IContact {

    /**
     * Контакт
     */
    private ИнтерфейсКонтакт contact;

    /**
     * Конструктор
     */
    public ContactAdapter() {
        this.contact = new РеализацияКонтакт();
    }

    @Override
    public String getFirstName() {
        return contact.вернутьИмя();
    }

    @Override
    public void setFirstName(String firstName) {
        contact.установитьИмя(firstName);
    }

    @Override
    public String getLastName() {
        return contact.вернутьФамилия();
    }

    @Override
    public void setLastName(String lastName) {
        contact.установитьФамилия(lastName);
    }

    @Override
    public String getTitle() {
        return contact.вернутьЗаголовок();
    }

    @Override
    public void setTitle(String title) {
        contact.установитьЗаголовок(title);
    }

    @Override
    public String getOrganization() {
        return contact.вернутьОрганизация();
    }

    @Override
    public void setOrganization(String organization) {
        contact.установитьОрганизация(organization);
    }

    @Override
    public IAddress getAddress() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAddress(IAddress address) {
        throw new UnsupportedOperationException();
    }
}
