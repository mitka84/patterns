package ru.savochkindv.patterns.flyweight;

/**
 * Класс, описывающий символ A
 *
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public class CharacterA extends EnglishCharacter {

    public CharacterA() {
        symbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}

