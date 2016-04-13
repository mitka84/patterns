package ru.savochkindv.patterns.facade;

import java.text.NumberFormat;

/**
 * Класс, описывающий валюту
 *
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class Currency {

    /**
     * Символ валюты
     */
    private char currencySymbol;

    /**
     * Формат записи числа
     */
    private NumberFormat numberFormat;

    public char getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(char currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }
}
