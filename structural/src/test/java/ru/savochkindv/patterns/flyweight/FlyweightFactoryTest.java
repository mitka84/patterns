package ru.savochkindv.patterns.flyweight;

import org.junit.Test;

/**
 * @author savochkindv
 *         Date: 14.04.2016.
 */
public class FlyweightFactoryTest {

    @Test
    public void getCharacter() throws Exception {

        FlyweightFactory factory = new FlyweightFactory();
        int[] characterCodes = {1, 2, 3};
        for (int nextCode : characterCodes) {
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }

}