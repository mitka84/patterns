package ru.savochkindv.patterns.model.helper;

import ru.savochkindv.patterns.model.ContactImpl;
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


}
