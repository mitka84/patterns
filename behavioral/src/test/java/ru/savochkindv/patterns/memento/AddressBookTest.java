package ru.savochkindv.patterns.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.savochkindv.patterns.model.helper.TestHelper.makeContactNullableAddress;

/**
 * Класс-помошник для тесто. Знаю, что так не хорошо.
 * @author savochkindv
 *         Date: 10.02.2016.
 */
public class AddressBookTest {

    @Test
    public void testSetMemento() throws Exception {
        AddressBook book = prepareAddressBook();
        assertEquals(4, book.getContacts().size());
        Object memento = book.getMemento();
        book.removeAllContacts();
        assertEquals(0, book.getContacts().size());
        book.setMemento(memento);
        assertEquals(4, book.getContacts().size());
    }

    private AddressBook prepareAddressBook() {
        AddressBook book = new AddressBook();
        book.addContact(makeContactNullableAddress("Дмитрий", "Савочкин", "Папа", "БИФИТ"));
        book.addContact(makeContactNullableAddress("Светлана", "Савочкина", "Мама", "нет"));
        book.addContact(makeContactNullableAddress("Артем", "Долгов", "Старшенький", "садик"));
        book.addContact(makeContactNullableAddress("Максим", "Савочкин", "Младшенький", "садик"));
        return book;
    }
}