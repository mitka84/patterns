package ru.savochkindv.patterns.visitor;

import org.junit.Test;

/**
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class ICarElementVisitorTest {

    @Test
    public void testPrintVisitor() throws Exception {
        ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
    }

    @Test
    public void testDoVisitor() throws Exception {
        ICarElement car = new Car();
        car.accept(new CarElementDoVisitor());
    }
}