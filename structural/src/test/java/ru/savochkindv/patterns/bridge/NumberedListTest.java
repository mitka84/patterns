package ru.savochkindv.patterns.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class NumberedListTest {

    private BaseList list = new NumberedList();

    @Test
    public void testGet() throws Exception {
        list.setImplementor(new OrderedListImpl());
        list.add("Один");
        list.add("Два");
        list.add("Три");
        assertEquals("1. Один", list.get(0));
        assertEquals("2. Два", list.get(1));
        assertEquals("3. Три", list.get(2));
    }
}