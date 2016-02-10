package ru.savochkindv.patterns.interpreter;

import ru.savochkindv.patterns.model.interfaces.IContact;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий список контактов
 * Created by savochkindv on 02.02.2016.
 */
public class ContactList {

    /**
     * Список контактов
     */
    private List<IContact> contacts = new ArrayList<>();

    public List<IContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<IContact> contacts) {
        this.contacts = contacts;
    }

    public IContact[] getContactsAsArray() {
        return contacts.toArray(new IContact[contacts.size()]);
    }

    /**
     * Возвращает результат выполнения выражения над списком контактов
     *
     * @param expression выражение
     * @param context    контекст
     * @param key        ключ
     * @return результат
     */
    public List<IContact> getContactMatchingExpression(IExpression expression, Context context, Object key) {
        List<IContact> result = new ArrayList<>();
        for (IContact contact : contacts) {
            context.addVariable(key, contact);
            expression.interpret(context);
            Object interpretResult = context.get(expression);
            if (interpretResult != null && interpretResult.equals(Boolean.TRUE)) {
                result.add(contact);
            }
        }
        return result;
    }

    /**
     * Добавляет контакт в список
     *
     * @param element контакт
     */
    public void addContact(IContact element) {
        if (!contacts.contains(element)) {
            contacts.add(element);
        }
    }

    /**
     * Удаляет контакт из списка
     *
     * @param element контакт
     */
    public void removeContact(IContact element) {
        contacts.remove(element);
    }

    @Override
    public String toString() {
        return contacts.toString();
    }
}
