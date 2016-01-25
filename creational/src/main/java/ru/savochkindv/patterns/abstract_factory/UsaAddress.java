package ru.savochkindv.patterns.abstract_factory;

/**
 * Created by savochkindv on 25.01.2016.
 */
public class UsaAddress extends Address {

    /**
     * Страна
     */
    private static final String COUNTRY = "UNITED STATES";

    /**
     * Разделитель
     */
    private static final String COMMA = ",";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getFullString() {
        return getStreet() + EOL_STRING + getCity() + COMMA + SPACE
                + getRegion() + SPACE + getPostalCode() + EOL_STRING
                + COUNTRY + EOL_STRING;
    }
}
