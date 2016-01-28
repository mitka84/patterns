package ru.savochkindv.patterns.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by savochkindv on 28.01.2016.
 */
public class AddressTest {

    @Test
    public void testCopy() throws Exception {
        Address current = new Address(AddressType.HOME, "Юбилейная", "Ногинск", "Московская область", "142407");
        Address prototype = current.copy();
        assertEquals(current.getCity(), prototype.getCity());
        assertEquals(current.getStreet(), prototype.getStreet());
        assertEquals(current.getState(), prototype.getState());
        assertEquals(current.getZipCode(), prototype.getZipCode());
        assertEquals(AddressType.HOME, current.getType());
        assertEquals(AddressType.WORK, prototype.getType());
    }
}