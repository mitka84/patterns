package ru.savochkindv.patterns.facade;

import java.text.NumberFormat;

/**
 * Класс, описывающий национальные настройки
 *
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class Nation {

    /**
     * Национальность
     */
    private NationType type;

    /**
     * Символ
     */
    private char symbol;

    /**
     * Префикс для набора номера
     */
    private String dialingPrefix;

    /**
     * Наименование файла с пропетями
     */
    private String propertyFileName;

    /**
     * Форматер числа
     */
    private NumberFormat numberFormat;

    public Nation(NationType type, char symbol, String dialingPrefix, String propertyFileName, NumberFormat numberFormat) {
        this.type = type;
        this.symbol = symbol;
        this.dialingPrefix = dialingPrefix;
        this.propertyFileName = propertyFileName;
        this.numberFormat = numberFormat;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getDialingPrefix() {
        return dialingPrefix;
    }

    public String getPropertyFileName() {
        return propertyFileName;
    }

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    public NationType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.name();
    }
}
