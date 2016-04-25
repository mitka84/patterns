package ru.savochkindv.patterns.model.helper;

import ru.savochkindv.patterns.model.AddressImpl;
import ru.savochkindv.patterns.model.ContactImpl;
import ru.savochkindv.patterns.model.enums.AddressType;
import ru.savochkindv.patterns.model.interfaces.IAddress;
import ru.savochkindv.patterns.model.interfaces.IContact;

/**
 *
 * @author savochkindv
 *         Date: 10.02.2016.
 */
public class TestHelper {

    private TestHelper() {
    }

    public static IContact makeContactNullableAddress(String firstName, String lastName, String title, String organization) {
        return new ContactImpl(firstName, lastName, title, organization, null);
    }

    public static IAddress makeAddress(AddressType type, String state, String city, String street, String zipCode, String description) {
        IAddress address = new AddressImpl();
        address.setCity(city);
        address.setDescription(description);
        address.setState(state);
        address.setType(type);
        address.setStreet(street);
        address.setZipCode(zipCode);
        return address;
    }


}
