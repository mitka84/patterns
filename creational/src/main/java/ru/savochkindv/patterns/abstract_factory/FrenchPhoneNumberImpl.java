package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, описывающий французский номер телефона
 * Created by savochkindv on 25.01.2016.
 */
public class FrenchPhoneNumberImpl extends AbstractPhoneNumber {

    /**
     * Код страны
     */
    private static final String COUNTRY_CODE = "33";

    /**
     * Длина номера
     */
    private static final int NUMBER_LENGTH = 9;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException("Номер телефона должен содержать" + NUMBER_LENGTH + "символов");
        }
        super.setPhoneNumber(phoneNumber);
    }
}
