package ru.savochkindv.patterns.flyweight;

/**
 * Абстрактный класс, описывающий символ
 *
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public abstract class EnglishCharacter {

    /**
     * Символ
     */
    protected char symbol;

    /**
     * Ширина
     */
    protected int width;

    /**
     * Высота
     */
    protected int height;

    /**
     * Печать
     */
    public abstract void printCharacter();

}
