package ru.savochkindv.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, представляющий собой приспособленную фабрику
 *
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public class FlyweightFactory {

    private Map<Integer, EnglishCharacter> characters = new HashMap<>();

    /**
     * Возвращает символ
     *
     * @param characterCode код символа
     * @return символ
     */
    public EnglishCharacter getCharacter(int characterCode) {
        EnglishCharacter character = characters.get(new Integer(characterCode));
        if (character == null) {
            switch (characterCode) {
                case 1: {
                    character = new CharacterA();
                    break;
                }
                case 2: {
                    character = new CharacterB();
                    break;
                }
                case 3: {
                    character = new CharacterC();
                    break;
                }
            }
            characters.put(characterCode, character);
        }
        return character;
    }
}
