package ru.savochkindv.patterns.memento;

import ru.savochkindv.patterns.model.interfaces.IContact;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий адресную книгу
 * Created by savochkindv on 10.02.2016.
 */
public class AddressBook {

    /**
     * Список контактов
     */
    private List<IContact> contacts = new ArrayList<>();

    /**
     * Конструктор
     */
    public AddressBook() {
    }

    /**
     * Конструктор
     *
     * @param contacts список контактов
     */
    public AddressBook(List<IContact> contacts) {
        this.contacts = contacts;
    }

    public List<IContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<IContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Добавляет контакт в список
     *
     * @param contact контакт
     */
    public void addContact(IContact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    /**
     * Удаляет контакт из списка
     *
     * @param contact контакт
     */
    public void removeContact(IContact contact) {
        contacts.remove(contact);
    }

    /**
     * Создает снимок контактов
     *
     * @return объект
     */
    public Object getMemento() {
        return new AddressBookMemento(contacts);
    }

    /**
     * Восстанавливает состояние контактов
     *
     * @param object объект для восстановления
     */
    public void setMemento(Object object) {
        if (object instanceof AddressBookMemento) {
            AddressBookMemento memento = (AddressBookMemento) object;
            contacts = memento.state;
        }
    }

    /**
     * Удаляет все контакты
     */
    public void removeAllContacts() {
        contacts = new ArrayList<>();
    }

    public String toString() {
        return contacts.toString();
    }

    /**
     * Класс, описывающий контейнер, для сохранения списка контактов
     */
    private class AddressBookMemento {

        /**
         * Список контактов
         */
        private List<IContact> state;

        /**
         * Конструктор
         *
         * @param state список контактов
         */
        public AddressBookMemento(List<IContact> state) {
            this.state = state;
        }
    }

}
