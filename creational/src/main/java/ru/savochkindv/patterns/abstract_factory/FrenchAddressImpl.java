package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, описывающий французский адрес
 * Created by savochkindv on 25.01.2016.
 */
public class FrenchAddressImpl extends AbstractAddress {

    /**
     * Строна
     */
    private static final String COUNTRY = "FRANCE";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getFullString() {
        return getStreet() + EOL_STRING + getCity() + SPACE
                + getRegion() + SPACE + getPostalCode() + EOL_STRING
                + COUNTRY + EOL_STRING;
    }
}
