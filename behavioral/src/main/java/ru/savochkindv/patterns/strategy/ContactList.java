package ru.savochkindv.patterns.strategy;

import ru.savochkindv.patterns.model.interfaces.IContact;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий список контактов
 *
 * @author savochkindv
 *         Date: 16.02.2016.
 */
public class ContactList {

    /**
     * Список контактов
     */
    private List<IContact> contacts = new ArrayList<>();

    /**
     * Стратегия сортировки
     */
    private ISummarizingStrategy summarizer;

    public List<IContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<IContact> contacts) {
        this.contacts = contacts;
    }

    public IContact[] getContactsAsArray() {
        return contacts.toArray(new IContact[contacts.size()]);
    }

    public void addContact(IContact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    public void removeContact(IContact contact) {
        contacts.remove(contact);
    }

    public void setSummarizer(ISummarizingStrategy summarizer) {
        this.summarizer = summarizer;
    }

    /**
     * Возвращает строку с отсортированным списком контактов,
     * в зависимости от выбранной стратегии
     *
     * @return строку с отсортированным списком контактов
     */
    public String summarize() {
        return summarizer.summarize(getContactsAsArray());
    }

    /**
     * Возвращает отсортированный массив строк, представляющих контакт
     *
     * @return отсортированный массив строк
     */
    public String[] makeSummarizedList() {
        return summarizer.makeSummarizedList(getContactsAsArray());
    }
}
