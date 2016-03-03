package ru.savochkindv.patterns.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author savochkindv
 *         Date: 03.03.2016.
 */
public class ContactAdapterTest {

    public static final String TITLE = "Заголовок";
    public static final String ORGANIZATION = "Организация";
    public static final String LAST_NAME = "Фамилия";
    public static final String FIRST_NAME = "Имя";

    private ContactAdapter adapter = new ContactAdapter();

    @Test
    public void testSetFirstName() throws Exception {
        adapter.setFirstName(FIRST_NAME);
        assertEquals(FIRST_NAME, adapter.getFirstName());
    }

    @Test
    public void testSetLastName() throws Exception {
        adapter.setLastName(LAST_NAME);
        assertEquals(LAST_NAME, adapter.getLastName());
    }

    @Test
    public void testSetOrganization() throws Exception {
        adapter.setOrganization(ORGANIZATION);
        assertEquals(ORGANIZATION, adapter.getOrganization());
    }

    @Test
    public void testSetTitle() throws Exception {
        adapter.setTitle(TITLE);
        assertEquals(TITLE, adapter.getTitle());
    }
}