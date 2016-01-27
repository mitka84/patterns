package ru.savochkindv.patterns.abstract_factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by savochkindv on 25.01.2016.
 */
public class FrenchAddressFactoryImplTest {

    private IAddressFactory factory = new FrenchAddressFactoryImpl();

    @Test
    public void testCreateAddress() throws Exception {
        AbstractAddress address = factory.createAddress();
        assertEquals("FRANCE", address.getCountry());
    }

    @Test
    public void testCreatePhoneNumber() throws Exception {
        AbstractPhoneNumber phoneNumber = factory.createPhoneNumber();
        assertEquals("33", phoneNumber.getCountryCode());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumber() throws Exception {
        AbstractPhoneNumber phoneNumber = factory.createPhoneNumber();
        phoneNumber.setPhoneNumber("1234567890");
    }
}