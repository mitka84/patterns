package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, описывающий номер телефона для США
 * Created by savochkindv on 25.01.2016.
 */
public class UsaPhoneNumberImpl extends AbstractPhoneNumber {

    /**
     * Код страны
     */
    private static final String COUNTRY_CODE = "01";

    /**
     * Длина номера телефона
     */
    private static final int NUMBER_LENGTH = 10;

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
