package ru.savochkindv.patterns.flyweight;

/**
 * Класс, описывающий символ A
 *
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public class CharacterB extends EnglishCharacter {

    public CharacterB() {
        symbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}

