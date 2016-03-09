package ru.savochkindv.patterns.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class BaseListTest {

    private BaseList list = new BaseList();

    @Test
    public void testGet() throws Exception {
        list.setImplementor(new OrderedListImpl());
        list.add("Один");
        list.add("Два");
        list.add("Три");
        assertEquals(3, list.count());
        assertEquals("Один", list.get(0));
        assertEquals("Два", list.get(1));
        assertEquals("Три", list.get(2));
    }
}