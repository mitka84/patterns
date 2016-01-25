package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, описывающий адрес
 * Created by savochkindv on 25.01.2016.
 */
public abstract class Address {

    /**
     * Конец строки
     */
    public static final String EOL_STRING = System.getProperty("line.separator");

    /**
     * Пробел
     */
    public static final String SPACE = " ";

    /**
     * Улица
     */
    private String street;

    /**
     * Город
     */
    private String city;

    /**
     * Регион
     */
    private String region;

    /**
     * Индекс
     */
    private String postalCode;

    /**
     * Возвращает полный адрес
     *
     * @return полный адрес
     */
    public String getFullString() {
        return street + EOL_STRING + city + SPACE + postalCode + EOL_STRING;
    }

    /**
     * Возвращает страну
     *
     * @return страну
     */
    public abstract String getCountry();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
