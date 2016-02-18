package ru.savochkindv.patterns.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.savochkindv.patterns.model.helper.TestHelper.makeContactNullableAddress;

/**
 * @author savochkindv
 *         Date: 18.02.2016.
 */
public class ContactListTest {

    private ContactList contacts = makeContactList();

    @Test
    public void testSummarize_nameStrategy() throws Exception {
        contacts.setSummarizer(new NameSummarizer());
        String summarizedList = contacts.summarize();
        System.out.println(summarizedList);
    }

    @Test
    public void testMakeSummarizedList_nameStrategy() throws Exception {
        contacts.setSummarizer(new NameSummarizer());
        String[] strings = contacts.makeSummarizedList();
        assertEquals("Долгов Артем", strings[0]);
        assertEquals("Савочкин Дмитрий", strings[1]);
        assertEquals("Савочкин Максим", strings[2]);
        assertEquals("Савочкина Светлана", strings[3]);
    }

    @Test
    public void testSummarize_organizationStrategy() throws Exception {
        contacts.setSummarizer(new OrganizationSummarizer());
        String summarizedList = contacts.summarize();
        System.out.println(summarizedList);
    }

    @Test
    public void testMakeSummarizedList_organizationStrategy() throws Exception {
        contacts.setSummarizer(new OrganizationSummarizer());
        String[] strings = contacts.makeSummarizedList();
        assertEquals("БИФИТ: Савочкин Дмитрий", strings[0]);
        assertEquals("нет: Савочкина Светлана", strings[1]);
        assertEquals("садик: Долгов Артем", strings[2]);
        assertEquals("садик: Савочкин Максим", strings[3]);
    }

    private ContactList makeContactList() {
        ContactList contactList = new ContactList();
        contactList.addContact(makeContactNullableAddress("Дмитрий", "Савочкин", "Папа", "БИФИТ"));
        contactList.addContact(makeContactNullableAddress("Светлана", "Савочкина", "Мама", "нет"));
        contactList.addContact(makeContactNullableAddress("Артем", "Долгов", "Старшенький", "садик"));
        contactList.addContact(makeContactNullableAddress("Максим", "Савочкин", "Младшенький", "садик"));
        return contactList;
    }
}