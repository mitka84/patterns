package ru.savochkindv.patterns.flyweight;

/**
 * Класс, описывающий символ A
 *
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public class CharacterC extends EnglishCharacter {

    public CharacterC() {
        symbol = 'C';
        width = 30;
        height = 40;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}

