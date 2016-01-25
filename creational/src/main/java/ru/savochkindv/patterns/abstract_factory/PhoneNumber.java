package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, описывающий номер телефона
 * Created by savochkindv on 25.01.2016.
 */
public abstract class PhoneNumber {

    /**
     * Номер телефона
     */
    private String phoneNumber;

    /**
     * Возвращает код страны
     *
     * @return код страны
     */
    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            Long.parseLong(phoneNumber);
            this.phoneNumber = phoneNumber;
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Некорректный формат номера телефона");
        }
    }
}
