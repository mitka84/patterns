package ru.savochkindv.patterns.abstract_factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by savochkindv on 25.01.2016.
 */
public class FrenchAddressFactoryTest {

    private AddressFactory factory = new FrenchAddressFactory();

    @Test
    public void testCreateAddress() throws Exception {
        Address address = factory.createAddress();
        assertEquals("FRANCE", address.getCountry());
    }

    @Test
    public void testCreatePhoneNumber() throws Exception {
        PhoneNumber phoneNumber = factory.createPhoneNumber();
        assertEquals("33", phoneNumber.getCountryCode());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumber() throws Exception {
        PhoneNumber phoneNumber = factory.createPhoneNumber();
        phoneNumber.setPhoneNumber("1234567890");
    }
}