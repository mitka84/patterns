package ru.savochkindv.patterns.facade;

/**
 * Класс, описывающий номер телефона
 *
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class PhoneNumber {

    /**
     * Выбранный интернациональный префикс
     */
    private static String selectedInterPrefix;

    /**
     * Интернациональный префикс
     */
    private String internationalPrefix;

    /**
     * Областной номер
     */
    private String areaNumber;

    /**
     * Номер в сети
     */
    private String netNumber;

    /**
     * Конструктор
     *
     * @param internationalPrefix интернациональный префикс
     * @param areaNumber          областной номер
     * @param netNumber           номер в сети
     */
    public PhoneNumber(String internationalPrefix, String areaNumber, String netNumber) {
        this.internationalPrefix = internationalPrefix;
        this.areaNumber = areaNumber;
        this.netNumber = netNumber;
    }

    public static String getSelectedInterPrefix() {
        return selectedInterPrefix;
    }

    public static void setSelectedInterPrefix(String selectedInterPrefix) {
        PhoneNumber.selectedInterPrefix = selectedInterPrefix;
    }

    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    public void setInternationalPrefix(String internationalPrefix) {
        this.internationalPrefix = internationalPrefix;
    }

    public String getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(String areaNumber) {
        this.areaNumber = areaNumber;
    }

    public String getNetNumber() {
        return netNumber;
    }

    public void setNetNumber(String netNumber) {
        this.netNumber = netNumber;
    }

    @Override
    public String toString() {
        return internationalPrefix + areaNumber + netNumber;
    }
}
