package ru.savochkindv.patterns.messenger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by savochkindv on 18.01.2016.
 */
public class SpaceTest {

    @Test
    public void testTranslate() throws Exception {
        Point source = new Point(1, 2, 3);
        Point result = Space.translate(source, new Vector(10, 20));
        System.out.println(source);
        System.out.println(result);
        assertEquals("Point[x=1,y=2,z=3]", source.toString());
        assertEquals("Point[x=2,y=3,z=4]", result.toString());
    }
}